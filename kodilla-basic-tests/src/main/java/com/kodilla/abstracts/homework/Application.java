package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(20);
        System.out.println("Area of Square: " + square.area());
        System.out.println("Circuit of Square: " + square.circuit());

        Shape rectangle = new Rectangle(20, 30);
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Circuit of rectangle: " + rectangle.circuit() );
    }
}
