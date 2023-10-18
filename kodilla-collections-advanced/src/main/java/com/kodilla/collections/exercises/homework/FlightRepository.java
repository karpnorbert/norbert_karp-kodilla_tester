package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Warsaw", "Paris"));
        flights.add(new Flight("Paris", "New York"));
        flights.add(new Flight("Berlin", "Rome"));
        flights.add(new Flight("Rome", "Madrid"));
        return flights;
    }
}
