package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private double time;

    private double way;

    public Audi(double time, double way) {
        this.time = time;
        this.way = way;
    }


    @Override
    public int getSpeed() {
        return (int) (way / time);
    }

    @Override
    public int increaseSpeed() {

        return (int) (way / time + 8);
    }

    @Override
    public int decreaseSpeed() {
        return (int) (way / time - 3);
    }
}
