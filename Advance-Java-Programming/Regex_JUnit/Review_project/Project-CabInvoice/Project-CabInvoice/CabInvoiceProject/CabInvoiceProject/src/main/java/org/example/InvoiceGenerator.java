package org.example;

public class InvoiceGenerator {

    @ImportantFeature("Calculates fare for normal and premium rides")
    public double calculateFare(Ride ride) {

        if (ride.rideType == RideType.NORMAL) {
            double fare = ride.distance * 10 + ride.time * 1;
            return Math.max(fare, 5);
        } else {
            double fare = ride.distance * 15 + ride.time * 2;
            return Math.max(fare, 20);
        }
    }

    public Invoice generateInvoice(Ride[] rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }

        return new Invoice(rides.length, totalFare);
    }
}