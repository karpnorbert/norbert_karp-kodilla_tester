package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Anna Wiśniewska", null));
        students.add(new Student("Piotr Nowakowski", new Teacher("Michał Kowalczyk")));
        students.add(new Student("Magdalena Wójcik", null));

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
    }
}
