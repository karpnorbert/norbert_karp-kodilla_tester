package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        /*(Square square = new Square(10.0);
        System.out.println("Area of Square is equal :" + " " + square.getArea());
        System.out.println("Perimetr of Square is equal: " + " " + square.getPerimeter());

        Circle circle = new Circle(7.00);
        System.out.println("Area of Circle is equal: " + " " + circle.getArea());
        System.out.println("Perimetr of Circle is equal: " + " " + circle.getPerimeter());

        Triangle triangle = new Triangle(20,30,40);
        System.out.println("Area of triangle is equal: " + " " + triangle.getArea());
        System.out.println("Perimmeter of triangle is equal: " + " " + triangle.getPerimeter());
    }*/

        Square square = new Square(10.0);
        showShapeDetails(square);

        Circle circle = new Circle(7.0);
        showShapeDetails(circle);

        Triangle triangle = new Triangle(6.0, 4.0, 7.211);
        showShapeDetails(triangle);
    }

    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}