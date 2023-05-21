package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {23, 324, 57, 64, 5, 2, 98, 45, 63, 53, 432, 345, 67, 23, 6, 87, 54, 90, 20, 33};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        Assertions.assertEquals(94.55, result);

    }
}
