package com.kodilla.execution_model.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {

    private Shop shop = new Shop();

    private static Stream<Arguments> provideDatesForTestingOrdersBetweenDates() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 10), 2),
                Arguments.of(LocalDate.of(2022, 1, 5), LocalDate.of(2022, 1, 20), 3)
                );
    }

    @ParameterizedTest
    @MethodSource("provideDatesForTestingOrdersBetweenDates")
    void testGetOrdersBetweenDates(LocalDate start, LocalDate end, int expectedSize) {
        //GIVEN
        shop.addOrder(new Order(100, LocalDate.of(2022, 1, 5), "user1"));
        shop.addOrder(new Order(200, LocalDate.of(2022, 1, 7), "user2"));
        shop.addOrder(new Order(300, LocalDate.of(2022, 1, 15), "user3"));
        //WHEN
        int resultSize = shop.getOrdersBetweenDates(start, end).size();
        //THEN
        assertEquals(expectedSize, resultSize);
    }
}
