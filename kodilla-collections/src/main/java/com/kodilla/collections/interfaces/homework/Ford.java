package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    private double time;

    private double way;

    public Ford(double time, double way) {
        this.time = time;
        this.way = way;
    }


    @Override
    public double getSpeed() {
        return way / time;
    }

    @Override
    public int increaseSpeed() {

        return (int) (way / time + 60);
    }

    @Override
    public int decreaseSpeed() {
        return (int) (way / time - 4);
    }

    public static void showFordDetails(Ford ford){
        System.out.println("Ford's Speed is: " + ford.getSpeed());
        System.out.println("Fords's Speead after increase: " + ford.increaseSpeed());
        System.out.println("Fords's Speed after decrese: " + ford.decreaseSpeed());
    }
}
