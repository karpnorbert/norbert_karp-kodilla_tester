package com.kodilla.inheritance.homework;

import java.time.Year;

public class App {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(2019);
        System.out.println("Year of car: " + operatingSystem.year);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
    }
}
