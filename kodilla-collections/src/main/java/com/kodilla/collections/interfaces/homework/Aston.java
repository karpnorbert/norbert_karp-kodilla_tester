
package com.kodilla.collections.interfaces.homework;

public class Aston implements Car{
    private double time;

    private double way;

    public Aston(double way, double time) {
        this.way = way;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Aston{" +
                "time=" + time +
                ", way=" + way +
                '}';
    }

    public static void add(Aston aston) {
    }

    public int getSpeed(){
        return (int) (way / time);
    }

    public int increaseSpeed(){
        return (int) ((way / time) + 25);
    }

    public int decreaseSpeed(){
        return (int) (way / time - 45);
    }

    @Override
    public void describeCar() {

    }
}