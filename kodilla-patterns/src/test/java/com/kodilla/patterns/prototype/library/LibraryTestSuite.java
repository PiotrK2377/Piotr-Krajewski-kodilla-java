package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;
public class LibraryTestSuite {

    @Test
    void testGetBook() {
        //Given
        Library libraryOne = new Library("Original library");
        libraryOne.getBooks().add(new Book("Dune","Frank Herbert", LocalDate.of(1965,8,15)));
        libraryOne.getBooks().add(new Book("The Maze Runner","James Dashner", LocalDate.of(2009,10,6)));
        libraryOne.getBooks().add(new Book("Metro 2033", "Dmitry Glukhovsky", LocalDate.of(2002,3,18)));

        Library libraryCloned = null;
        try {
            libraryCloned = libraryOne.shallowCopy();
            libraryCloned.setName("Copy library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library libraryDeepCopy = null;
        try {
            libraryDeepCopy = libraryOne.deepCopy();
            libraryDeepCopy.setName("Next copy library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When

        //Then
        assertEquals(3, libraryOne.getBooks().size());
        assertEquals(3, libraryCloned.getBooks().size());
        assertEquals(3, libraryDeepCopy.getBooks().size());
        System.out.println(libraryOne);
        System.out.println(libraryCloned);
        System.out.println(libraryDeepCopy);
    }
}
