package com.kodilla.collections.lists.homework;

public class Toyota implements Car {
    @Override
    public void describeCar() {
        System.out.println("This is a Toyota car.");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Decreasing speed of Toyota car.");
    }
}