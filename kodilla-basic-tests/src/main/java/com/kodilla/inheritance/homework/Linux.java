package com.kodilla.inheritance.homework;

class Linux extends OperatingSystem {
    public Linux(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Linux OS turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Linux OS turned off.");
    }
}
