package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Aston aston = new Aston(800, 3.2);
        showAstonDetails(aston);

        Ford ford = new Ford(3.40, 700);
        showFordDetails(ford);

        Audi audi = new Audi(8.4, 1600);
        showAudiDetails(audi);
    }
    public static void showFordDetails(Ford ford){
        System.out.println("The speed of the Ford is: " + ford.getSpeed() + " " + "[KM/H]");
        System.out.println("Ford's speed after increasing is:" + ford.increaseSpeed() + " " + "[KM/H]");
        System.out.println("Ford's speed after decreasing is:" + ford.decreaseSpeed() + " " + "[KM/H]");
    }

    public static void showAudiDetails(Audi audi){
        System.out.println("The speed of the Audi is: " + audi.getSpeed() + " " + "[KM/H]");
        System.out.println("Audi's speed after increasing is: " + audi.increaseSpeed() + " " + "[KM/H]");
        System.out.println("Audi's speed after decreasing is:" + audi.decreaseSpeed() + " " + "[KM/H]");
    }
    public static void showAstonDetails(Aston aston){
        System.out.println("The speed of the Aston is: " + aston.getSpeed() + " " + "[KM/H]");
        System.out.println("Aston's speed after increasing is: " + aston.increaseSpeed() + " " +  "[KM/H]");
        System.out.println("Aston's speed after decreasing is:" + aston.decreaseSpeed() + " " + "[KM/H");
    }
}
