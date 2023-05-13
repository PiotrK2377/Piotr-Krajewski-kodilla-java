package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("we check the class with an empty list of numbers")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> zeroNumbers = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(zeroNumbers);
        System.out.println("Testing empty list of numbers " + result.size());
        //Then
        Assertions.assertEquals(0, result.size());
    }

    @DisplayName("we check the class against the full list of numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbersExample = new ArrayList<>();
        numbersExample.add(2);
        numbersExample.add(3);
        numbersExample.add(11);
        numbersExample.add(12);
        numbersExample.add(15);
        numbersExample.add(44);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbersExample);
        System.out.println("Testing full list of numbers " + result.size());

        //Then
        List<Integer> checkNumbers = new ArrayList<>();
        checkNumbers.add(2);
        checkNumbers.add(12);
        checkNumbers.add(44);
        Assertions.assertEquals(checkNumbers, result);

    }
}
