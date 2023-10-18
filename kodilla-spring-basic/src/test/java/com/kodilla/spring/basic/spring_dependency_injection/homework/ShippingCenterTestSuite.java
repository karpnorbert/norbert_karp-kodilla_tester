package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessMessageWhenWeightIsLessThan30() {
        String result = shippingCenter.sendPackage("Test Address", 20);
        assertEquals("Package delivered to: Test Address", result);
    }

    @Test
    public void shouldReturnFailMessageWhenWeightIsMoreThan30() {
        String result = shippingCenter.sendPackage("Test Address", 40);
        assertEquals("Package not delivered to: Test Address", result);
    }
}
