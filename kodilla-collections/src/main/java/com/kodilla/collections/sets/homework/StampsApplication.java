package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        Stamp stamp1 = new Stamp("Butterfly", "2x3 cm", true);
        Stamp stamp2 = new Stamp("Flower", "4x4 cm", false);
        Stamp stamp3 = new Stamp("Butterfly", "2x3 cm", true);

        stamps.add(stamp1);
        stamps.add(stamp2);
        stamps.add(stamp3);

        System.out.println("Number of stamps in the collection: " + stamps.size());
    }
}
