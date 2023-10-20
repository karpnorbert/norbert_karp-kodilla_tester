package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    public void shouldPrintStudentTeacherPairsWithOptionalHandling() {
        // given
        Student student1 = new Student("Jan Kowalski", new Teacher("Tomasz Nowak"));
        Student student2 = new Student("Anna Wiśniewska", null);
        Student student3 = new Student("Piotr Nowakowski", new Teacher("Michał Kowalczyk"));
        Student student4 = new Student("Magdalena Wójcik", null);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        String expectedOutput = "Uczeń: Jan Kowalski, nauczyciel: Tomasz Nowak" + System.lineSeparator() +
                "Uczeń: Anna Wiśniewska, nauczyciel: <undefined>" + System.lineSeparator() +
                "Uczeń: Piotr Nowakowski, nauczyciel: Michał Kowalczyk" + System.lineSeparator() +
                "Uczeń: Magdalena Wójcik, nauczyciel: <undefined>" + System.lineSeparator();

        // when
        StringBuilder output = new StringBuilder();
        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            output.append("Uczeń: ").append(student.getName()).append(", nauczyciel: ").append(teacherName).append(System.lineSeparator());
        }

        // then
        assertEquals(expectedOutput, output.toString());
    }
}
