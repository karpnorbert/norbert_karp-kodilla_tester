package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Client client = Mockito.mock(Client.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void subscribedClientShouldReceiveAlertForSpecificLocation() {
        weatherAlertService.subscribe(client, location);
        weatherAlertService.sendAlertToLocation(location);
        Mockito.verify(client, Mockito.times(1)).receive(location);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveAlert() {
        weatherAlertService.subscribe(client, location);
        weatherAlertService.unsubscribeFromLocation(client, location);
        weatherAlertService.sendAlertToLocation(location);
        Mockito.verify(client, Mockito.never()).receive(location);
    }

    @Test
    public void clientShouldBeAbleToUnsubscribeFromAllLocations() {
        weatherAlertService.subscribe(client, location);
        weatherAlertService.unsubscribeFromAllLocations(client);
        weatherAlertService.sendAlertToLocation(location);
        Mockito.verify(client, Mockito.never()).receive(location);
    }

    @Test
    public void allSubscribedClientsShouldReceiveGeneralAlert() {
        weatherAlertService.subscribe(client, location);
        weatherAlertService.sendGeneralAlert();
        Mockito.verify(client, Mockito.times(1)).receiveGeneralAlert();
    }

    @Test
    public void shouldDeleteSpecificLocation() {
        weatherAlertService.subscribe(client, location);
        weatherAlertService.deleteLocation(location);
        weatherAlertService.sendAlertToLocation(location);
        Mockito.verify(client, Mockito.never()).receive(location);
    }
}
