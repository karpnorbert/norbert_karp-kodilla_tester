package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public boolean addOrder(Order order) {
        return orders.add(order);
    }

    public Set<Order> getOrdersBetweenDates(LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> (order.getDate().isAfter(startDate) || order.getDate().isEqual(startDate))
                        && (order.getDate().isBefore(endDate) || order.getDate().isEqual(endDate)))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersInValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getValue() >= minValue && order.getValue() <= maxValue)
                .collect(Collectors.toSet());
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double getTotalValueOfOrders() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}
