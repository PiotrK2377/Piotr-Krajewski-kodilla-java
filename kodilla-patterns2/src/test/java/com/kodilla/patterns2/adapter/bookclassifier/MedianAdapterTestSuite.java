package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<BookA> books = new HashSet<>();
        books.add(new BookA("John","Dark Age", 2003,"SI"));
        books.add(new BookA("Sue", "Storm", 1997, "TR"));
        books.add(new BookA("Greg", "Lion", 2019, "UO"));
        books.add(new BookA("Finn", "Old War",1986,"WJ"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int medianYear = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2003, medianYear);
    }
}
