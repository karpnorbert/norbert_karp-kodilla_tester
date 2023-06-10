package com.kodilla.collections.lists.homework;
import com.kodilla.collections.lists.homework.BMW;
import com.kodilla.collections.lists.homework.Toyota;
import com.kodilla.collections.lists.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car car1 = (Car) new Ford();
        cars.add(car1);

        Car car2 = (Car) new Toyota();
        cars.add(car2);

        Car car3 = (Car) new BMW();
        cars.add(car3);

        System.out.println("Lista przed usunięciami:");
        for (Car car : cars) {
            car.describeCar();
        }

        cars.remove(1);
        cars.remove(car3);

        System.out.println("\nLista po usunięciach:");
        for (Car car : cars) {
            car.describeCar();
        }

        System.out.println("Rozmiar listy: " + cars.size());
    }
}