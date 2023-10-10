package com.kodilla.collections.lists.homework;

public class BMW implements Car {
    @Override
    public void describeCar() {
        System.out.println("This is a BMW car.");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Decreasing speed of BMW car.");
    }
}