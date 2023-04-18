package com.kodilla.collections.interfaces.homework;


import static com.kodilla.collections.interfaces.homework.Aston.showAstonDetails;
import static com.kodilla.collections.interfaces.homework.Ford.showFordDetails;

public class CarRace {
    public static void main(String[] args) {

        Aston aston = new Aston(800, 3.2);
        showAstonDetails(aston);

        Ford ford = new Ford(700, 4.2);
        showFordDetails(ford);

    }
}
