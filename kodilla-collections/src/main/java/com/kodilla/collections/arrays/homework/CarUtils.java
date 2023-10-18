package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("The speed of the car is: " + car.getSpeed() + " [KM/H]");
        System.out.println("Car's speed after increasing is: " + car.increaseSpeed() + " [KM/H]");
        System.out.println("Car's speed after decreasing is: " + car.decreaseSpeed() + " [KM/H]");
    }
}
