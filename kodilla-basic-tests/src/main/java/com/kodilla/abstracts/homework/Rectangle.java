package com.kodilla.abstracts.homework;

public abstract class Rectangle extends Shape{

    public double a;
    public double b;


    public double area() {
        return (2 * a) + (2 * b);
    }

    public double circuit() {
        return a * b;
    }
}
