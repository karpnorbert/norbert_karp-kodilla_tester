package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> studentCounts;

    public School(String name) {
        this.name = name;
        this.studentCounts = new ArrayList<>();
    }

    public void addStudentCount(int count) {
        studentCounts.add(count);
    }

    public String getName() {
        return name;
    }

    public int getTotalStudents() {
        int sum = 0;
        for (int count : studentCounts) {
            sum += count;
        }
        return sum;
    }
}
