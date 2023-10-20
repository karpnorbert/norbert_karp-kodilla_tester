package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args){
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be seved by our airlines");
        } finally {
            System.out.println("Thank you for using Kodilla AriLines");
        }
    }
}
