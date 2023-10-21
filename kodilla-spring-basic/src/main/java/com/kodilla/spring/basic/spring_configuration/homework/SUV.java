package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return isNight();
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

    @Override
    public void setHour(int hour) {

    }

    private boolean isNight() {
        // tu powinna być logika do sprawdzania godziny
        // (dla uproszczenia przyjmuje, że zawsze jest noc)
        return true;
    }
}
