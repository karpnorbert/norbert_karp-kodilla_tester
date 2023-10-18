package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {
    private int hour;

    @Override
    public void setHour(int hour) {
        this.hour = hour;
    }

    private boolean isNight() {
        return hour >= 20 || hour < 6;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return isNight();
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
