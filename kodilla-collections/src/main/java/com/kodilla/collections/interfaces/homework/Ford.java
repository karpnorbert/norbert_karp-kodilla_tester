package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    private double time;

    private double way;

    public Ford(double time, double way) {
        this.time = time;
        this.way = way;
    }


    @Override
    public int getSpeed() {
        return (int) (way / time);
    }

    @Override
    public int increaseSpeed() {

        return (int) (way / time + 60);
    }

    @Override
    public int decreaseSpeed() {
        return (int) (way / time - 4);
    }

    @Override
    public void describeCar() {

    }


}
