package org.example;

public class Invoice {
    int totalRides;
    double totalFare;
    double averageFare;

    public Invoice(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.averageFare = totalFare / totalRides;
    }

    public void displayInvoice() {
        System.out.println("Total Rides: " + totalRides);
        System.out.println("Total Fare: " + totalFare);
        System.out.println("Average Fare: " + averageFare);
    }
}