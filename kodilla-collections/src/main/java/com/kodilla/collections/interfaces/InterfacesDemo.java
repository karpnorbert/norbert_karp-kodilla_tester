package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10.0);
        System.out.println("Area of Square is equal :" + " " + square.getArea());
        System.out.println("Perimetr of Square is equal: " + " " + square.getPerimeter());

        Circle circle = new Circle(7.00);
        System.out.println("Area of Circle is equal: " + " " + circle.getArea());
        System.out.println("Perimetr of Circle is equal: " + " " + circle.getPerimeter());
    }
}