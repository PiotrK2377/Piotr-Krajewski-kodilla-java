package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProbablyIWillExceptionTestSuite {

    @Test
    void testWhenAnThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(4, 1.5))

        );
    }

    @Test
    void testWhenIsWithOutThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 5))
        );
    }
}
