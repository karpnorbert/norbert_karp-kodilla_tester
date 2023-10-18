
package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        Grades grades = new Grades();
        assertEquals(0, grades.getSize());
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, grades.getSize());
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }
}
