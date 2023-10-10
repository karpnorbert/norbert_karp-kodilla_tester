package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FlightFinderTest {
    @Test
    void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsFrom("Warsaw");
        Assertions.assertEquals(2, flights.size());
        Assertions.assertEquals("Warsaw", flights.get(0).getDeparture());
        Assertions.assertEquals("London", flights.get(0).getArrival());
        Assertions.assertEquals("Warsaw", flights.get(1).getDeparture());
        Assertions.assertEquals("Paris", flights.get(1).getArrival());
    }

    @Test
    void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsTo("Paris");
        Assertions.assertEquals(1, flights.size());
        Assertions.assertEquals("Warsaw", flights.get(0).getDeparture());
        Assertions.assertEquals("Paris", flights.get(0).getArrival());
    }
}
