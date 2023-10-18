package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Aston;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        int carsCount = random.nextInt(15) + 1;
        Car[] cars = new Car[carsCount];

        for (int i = 0; i < carsCount; i++) {
            cars[i] = drawCar();
            CarUtils.describeCar(cars[i]);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarType = random.nextInt(3);

        Car drawnCar;

        if (drawnCarType == 0) {
            drawnCar = new Aston(1000, random.nextDouble() * 10);  // losowe wartości dla drogi i czasu
        } else if (drawnCarType == 1) {
            drawnCar = new Audi(1000, random.nextDouble() * 10);
        } else {
            drawnCar = new Ford(1000, random.nextDouble() * 10);
        }

        return drawnCar;
    }
}
