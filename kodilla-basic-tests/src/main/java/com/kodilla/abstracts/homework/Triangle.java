package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Shape;

class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}