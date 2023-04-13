package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtrack(){
        Calculator calculator1 = new Calculator();
        int a1 = 5;
        int b2 = 5;
        int sumResult1 = calculator1.subtrack(1, b2);
        int sumResult = calculator1.subtrack(a1, b2);
    }
}