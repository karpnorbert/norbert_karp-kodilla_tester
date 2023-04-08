package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double circuit() {
        return 4 * a;
    }
}
