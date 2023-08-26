package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class WarehouseTestSuite {

    @Test
    public void testGetOrderShouldThrowExceptionWhenOrderDoesNotExist() {
        //Given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));

        //When & Then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("999"));
    }
}
