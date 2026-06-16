package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceGeneratorTest {

    InvoiceGenerator generator = new InvoiceGenerator();

    @Test
    void givenNormalRide_ShouldReturnFare() {
        Ride ride = new Ride(2.0, 5, RideType.NORMAL);

        double fare = generator.calculateFare(ride);

        assertEquals(25, fare);
    }

    @Test
    void givenNormalRide_ShouldReturnMinimumFare() {
        Ride ride = new Ride(0.1, 1, RideType.NORMAL);

        double fare = generator.calculateFare(ride);

        assertEquals(5, fare);
    }

    @Test
    void givenMultipleRides_ShouldReturnInvoice() {
        Ride[] rides = {
                new Ride(2.0, 5, RideType.NORMAL),
                new Ride(3.0, 10, RideType.NORMAL)
        };

        Invoice invoice = generator.generateInvoice(rides);

        assertEquals(2, invoice.totalRides);
        assertEquals(65, invoice.totalFare);
        assertEquals(32.5, invoice.averageFare);
    }

    @Test
    void givenPremiumRide_ShouldReturnPremiumFare() {
        Ride ride = new Ride(2.0, 5, RideType.PREMIUM);

        double fare = generator.calculateFare(ride);

        assertEquals(40, fare);
    }

    @Test
    void givenPremiumRide_ShouldReturnMinimumFare() {
        Ride ride = new Ride(0.1, 1, RideType.PREMIUM);

        double fare = generator.calculateFare(ride);

        assertEquals(20, fare);
    }
}