package com.kodilla.testing.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 0; n < booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n , 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        Assertions.assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
       //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        Assertions.assertEquals(0, theListOfBooks0.size());
        Assertions.assertEquals(15, theListOfBooks15.size());
        Assertions.assertEquals(0, theListOfBooks40.size());

    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        Assertions.assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock,times(0)).listBooksWithCondition(anyString());
    }

    @Nested
    @DisplayName("Tests for Library User")
    class TestUser {

        @Test
        void testListBookInHandsOfZero() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("John", "Nowak","4512");
            List<Book> resultZeroBooks = new ArrayList<>();
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultZeroBooks);
            //When
            List<Book> zeroBooks = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            Assertions.assertEquals(0,zeroBooks.size());
        }

        @Test
        void testListBookInHandsOfOne() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("John", "Nowak","4512");
            List<Book> resultOneBooks = generateListOfNBooks(1);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultOneBooks);
            //When
            List<Book> oneBooks = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            Assertions.assertEquals(1, oneBooks.size());
        }

        @Test
        void testListBookInHandsOfFive() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("John", "Nowak","4512");
            List<Book> resultFiveBooks = generateListOfNBooks(5);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultFiveBooks);
            //When
            List<Book> fiveBooks = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            Assertions.assertEquals(5, fiveBooks.size());
        }

    }
}
