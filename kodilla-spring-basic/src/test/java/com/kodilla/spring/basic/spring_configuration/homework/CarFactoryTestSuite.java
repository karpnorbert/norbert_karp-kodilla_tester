package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTestSuite {

    private ApplicationContext context = new AnnotationConfigApplicationContext(CarFactory.class);

    @RepeatedTest(3)
    public void shouldTurnOnLightsDuringNight() {
        Car car = (Car) context.getBean("chooseCar");

        car.setHour(21);
        assertTrue(car.hasHeadlightsTurnedOn());

        car.setHour(4);
        assertTrue(car.hasHeadlightsTurnedOn());

        car.setHour(7);
        assertFalse(car.hasHeadlightsTurnedOn());

        car.setHour(19);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldChooseCabrioInSummer() {
        Car car = (Car) context.getBean("chooseCar");
        if (LocalDate.now().getMonthValue() >= 6 && LocalDate.now().getMonthValue() <= 8) {
            assertEquals("Cabrio", car.getCarType());
        }
    }

    // Możesz dodać podobne testy dla SUV i Sedan oparte na miesiącu.
}
