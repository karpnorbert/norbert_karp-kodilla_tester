package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Triangle implements Shape {

    public double width;
    public double height;
    public double hypotenuse;

    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        return Double.compare(triangle.width, width) == 0 && Double.compare(triangle.height, height) == 0 && Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, hypotenuse);
    }

    @Override
    public double getPerimeter() {
        return width + height + hypotenuse;
    }
}
