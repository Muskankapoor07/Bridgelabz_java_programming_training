package core_programming.core_programming_basics.programming_element.Level1;

import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);
    }
}