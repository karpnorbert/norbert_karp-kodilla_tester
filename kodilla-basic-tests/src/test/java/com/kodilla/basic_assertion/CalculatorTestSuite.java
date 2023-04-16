package com.kodilla.basic_assertion;


import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        int sumResult1 = calculator1.subtrack(a1, b2);
        assertEquals(0, sumResult1);
    }
    @Test
    public void testPower(){
        Calculator calculator2 = new Calculator();
        double a2 = 2;
        int b3 = 4;
        double sumResult2 = calculator2.pow(1, b3);
        assertEquals(16, sumResult2, 0.001);
    }

    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);
    }
}