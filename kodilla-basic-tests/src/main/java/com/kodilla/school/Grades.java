package com.kodilla.school;

public class Grades {

    private int[] values = new int[10];
    private int size = 0;



    public double getAverage() {
        if (size == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < size; i++) {
            sum += this.values[i];
        }
        return sum/size;
    }

    public void add(int grade) {
        values[size] = grade;
        size++;
    }

    public int[] getValues() {
        return values;
    }

    public int getSize() {
        return size;
    }
}
