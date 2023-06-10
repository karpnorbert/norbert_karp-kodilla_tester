package com.kodilla.school;

public class Grades {

    private int[] values = new int[10];
    private int size = 0;



    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
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
