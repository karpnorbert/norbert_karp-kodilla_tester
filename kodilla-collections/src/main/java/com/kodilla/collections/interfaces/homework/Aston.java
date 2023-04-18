
package com.kodilla.collections.interfaces.homework;

public class Aston implements Car{
    private double time;

    private double way;

    public Aston(double way, double time) {
        this.way = way;
        this.time = time;
    }

    public double getSpeed(){
        return way / time;
    }

    public int increaseSpeed(){
        return (int) ((way / time) + 25);
    }

    public int decreaseSpeed(){
        return (int) (way / time - 45);
    }

    public static void showAstonDetails(Aston aston){
        System.out.println("Asston's Speed is: " + aston.getSpeed());
        System.out.println("Astonn's Speead after increase: " + aston.increaseSpeed());
        System.out.println("Aston's Speed after decrese: " + aston.decreaseSpeed());
    }
}