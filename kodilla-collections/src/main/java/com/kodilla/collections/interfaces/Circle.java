package com.kodilla.collections.interfaces;

public class Circle {
    private  double radius;
    static double PI = 3.1415927;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return PI * 2 * radius;
    }

    public double getPerimeter() {
        return PI * radius * radius;
    }
}

