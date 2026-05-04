package core_programming.core_programming_intermediate.control_flow.Level1;

import java.util.Scanner;

class LargestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("Is first largest? " + (a > b && a > c));
        System.out.println("Is second largest? " + (b > a && b > c));
        System.out.println("Is third largest? " + (c > a && c > b));
    }
}