package com.kodilla.inheritance.homework;

class Windows extends OperatingSystem {
    public Windows(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows OS turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows OS turned off.");
    }
}
