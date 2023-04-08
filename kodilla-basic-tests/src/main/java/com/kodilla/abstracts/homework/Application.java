package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square() {
            @Override
            double Circle() {
                return 0;
            }

            @Override
            double Area() {
                return 0;
            }
        };
        square.a = 10;
        System.out.println("Area of Square: " + square.area());
        System.out.println("Circuit of Square: " + square.circuit());

        Rectangle rectangle = new Rectangle() {
            @Override
            double Circle() {
                return 0;
            }

            @Override
            double Area() {
                return 0;
            }
        };
        rectangle.a = 20;
        rectangle.b = 40;
        System.out.println("Area of rectalngle: " + rectangle.area());
        System.out.println("Circuit of rectangle: " + rectangle.circuit() );

    }
}
