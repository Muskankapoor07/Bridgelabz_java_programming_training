package org.example;

import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {

        String userId = "user123";

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(userId);

        if (!matcher.matches()) {
            System.out.println("Invalid User ID");
            return;
        }

        Ride[] rides = {
                new Ride(2.0, 5, RideType.NORMAL),
                new Ride(3.0, 10, RideType.PREMIUM)
        };

        RideRepository repository = new RideRepository();
        repository.addRides(userId, rides);

        InvoiceGenerator generator = new InvoiceGenerator();
        Invoice invoice = generator.generateInvoice(repository.getRides(userId));

        invoice.displayInvoice();

        Method method = generator.getClass().getMethod("calculateFare", Ride.class);

        if (method.isAnnotationPresent(ImportantFeature.class)) {
            ImportantFeature feature = method.getAnnotation(ImportantFeature.class);
            System.out.println("Annotation: " + feature.value());
        }
    }
}