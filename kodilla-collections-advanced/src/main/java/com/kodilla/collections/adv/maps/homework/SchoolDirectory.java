package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal principal1 = new Principal("John Smith");
        Principal principal2 = new Principal("Anna Johnson");
        Principal principal3 = new Principal("Robert Davis");

        School school1 = new School("School A");
        School school2 = new School("School B");
        School school3 = new School("School C");

        school1.addStudentCount(30);
        school1.addStudentCount(25);
        school2.addStudentCount(20);
        school2.addStudentCount(18);
        school3.addStudentCount(35);

        schoolDirectory.put(principal1, school1);
        schoolDirectory.put(principal2, school2);
        schoolDirectory.put(principal3, school3);

        for (Map.Entry<Principal, School> entry : schoolDirectory.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();

            System.out.println("Principal: " + principal.getName());
            System.out.println("School: " + school.getName());
            System.out.println("Total Students: " + school.getTotalStudents());
            System.out.println();
        }
    }
}
