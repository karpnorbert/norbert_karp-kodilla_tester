package com.kodilla.inheritance.homework;

public class OperatingSystem {

    public OperatingSystem( int year) {
        this.year = year;
    }

    public int year;

    public void turnOn(){
        System.out.println("The system has been turned on!");
    }

    public void  turnOff(){
        System.out.println("The system has been turned off");
    }
}
