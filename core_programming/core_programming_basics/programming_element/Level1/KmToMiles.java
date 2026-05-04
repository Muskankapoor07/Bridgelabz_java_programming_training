package core_programming.core_programming_basics.programming_element.Level1;

import java.util.Scanner;

class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter km: ");
        double km = input.nextDouble();

        double miles = km * 1.6;

        System.out.println("The total miles is " + miles + " for the given " + km + " km");
    }
}