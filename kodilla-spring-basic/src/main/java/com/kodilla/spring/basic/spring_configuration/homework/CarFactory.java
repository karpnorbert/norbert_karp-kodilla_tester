package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarFactory {

    @Bean
    public Car chooseCar() {
        Car car;
        int month = LocalDate.now().getMonthValue();
        if (month >= 6 && month <= 8) {
            car = new Cabrio();
        } else if (month == 12 || month <= 2) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }
}
