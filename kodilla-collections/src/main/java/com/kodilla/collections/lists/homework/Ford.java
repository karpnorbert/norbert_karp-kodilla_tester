package com.kodilla.collections.lists.homework;

public class Ford implements Car {
    @Override
    public void describeCar() {
        System.out.println("This is a Ford car.");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Decreasing speed of Ford car.");
    }
}