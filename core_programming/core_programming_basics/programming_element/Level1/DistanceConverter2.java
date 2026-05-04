package core_programming.core_programming_basics.programming_element.Level1;

import java.util.Scanner;

class DistanceConverter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards: " + yards +
                " and in miles: " + miles);
    }
}