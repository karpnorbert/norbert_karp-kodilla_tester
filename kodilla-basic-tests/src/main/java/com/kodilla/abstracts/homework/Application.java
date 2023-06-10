package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Shape triangle = new Triangle(3, 4, 5, 4, 3);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

        Job teacherJob = new Teacher(3000, "teaching students");
        Job doctorJob = new Doctor(8000, "treating patients");
        Job engineerJob = new Engineer(5000, "designing and building structures");

        Person person1 = new Person("John", 30, teacherJob);
        Person person2 = new Person("Emily", 40, doctorJob);
        Person person3 = new Person("Michael", 35, engineerJob);

        person1.displayResponsibilities();
        person2.displayResponsibilities();
        person3.displayResponsibilities();
    }
}