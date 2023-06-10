package com.kodilla.collections.lists.homework;


import com.kodilla.collections.interfaces.homework.Aston;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Aston> astons = new ArrayList<>();
        astons.add(new Aston(300, 1.4));
        astons.add(new  Aston(684, 4.2));
        astons.add(new  Aston(500, 2.4));

        for (int n = 0; n < astons.size(); n++)
            System.out.println(astons.get(n));

    }
}
