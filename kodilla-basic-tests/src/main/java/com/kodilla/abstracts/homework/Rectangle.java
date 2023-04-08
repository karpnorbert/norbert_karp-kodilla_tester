package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return (2 * a) + (2 * b);
    }

    @Override
    public double circuit() {
        return a * b;
    }
}
