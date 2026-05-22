package DSA;

import java.util.*;

public class MetroTicketBooking {

    Queue<String> bookingQueue = new LinkedList<>();

    void addBooking(String name) {
        bookingQueue.add(name);
        System.out.println(name + " booking added ");
    }

    void processBooking() {
        if (bookingQueue.isEmpty()) {
            System.out.println("No bookings available ");
        } else {
            System.out.println(bookingQueue.remove() + " ticket booked.");
        }
    }

    void viewNextBooking() {
        System.out.println("Next Booking: " + bookingQueue.peek());
    }

    void displayQueue() {
        System.out.println("Pending Queue: " + bookingQueue);
    }

    public static void main(String[] args) {

        MetroTicketBooking mb = new MetroTicketBooking();

        mb.addBooking("Muskan");
        mb.addBooking("Rahul");
        mb.addBooking("Priya");

        mb.displayQueue();

        mb.viewNextBooking();

        mb.processBooking();

        mb.displayQueue();
    }
}