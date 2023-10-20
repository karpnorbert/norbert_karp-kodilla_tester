package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {

    private Map<Location, Set<Client>> locationSubscribers = new HashMap<>();

    public void subscribe(Client client, Location location) {
        locationSubscribers.computeIfAbsent(location, k -> new HashSet<>()).add(client);
    }

    public void unsubscribeFromLocation(Client client, Location location) {
        if(locationSubscribers.containsKey(location)) {
            locationSubscribers.get(location).remove(client);
        }
    }

    public void unsubscribeFromAllLocations(Client client) {
        locationSubscribers.forEach((key, value) -> value.remove(client));
    }

    public void sendAlertToLocation(Location location) {
        if(locationSubscribers.containsKey(location)) {
            locationSubscribers.get(location).forEach(client -> client.receive(location));
        }
    }

    public void sendGeneralAlert() {
        locationSubscribers.values().stream()
                .flatMap(Set::stream)
                .distinct()
                .forEach(Client::receiveGeneralAlert);
    }

    public void deleteLocation(Location location) {
        locationSubscribers.remove(location);
    }
}
