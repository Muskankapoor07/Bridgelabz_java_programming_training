package org.example;

import java.util.HashMap;

public class RideRepository {

    HashMap<String, Ride[]> userRides = new HashMap<>();

    public void addRides(String userId, Ride[] rides) {
        userRides.put(userId, rides);
    }

    public Ride[] getRides(String userId) {
        return userRides.get(userId);
    }
}