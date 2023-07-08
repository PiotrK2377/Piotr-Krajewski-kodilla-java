package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given

        //When
        double valAdd = calculator.add(5,8);
        double valSub = calculator.sub(10,2);
        double valMul = calculator.mul(5,3);
        double valDiv = calculator.div(8,4);

        //Then
        assertEquals(13.0, valAdd);
        assertEquals(8.0, valSub);
        assertEquals(15.0, valMul);
        assertEquals(2.0, valDiv);
    }
}
