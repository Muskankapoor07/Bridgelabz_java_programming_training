package core_programming.core_programming_intermediate.control_flow.Level2;

import java.util.Scanner;

class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base = input.nextInt();
        int power = input.nextInt();

        int result = 1;
        int i = 0;

        while (i < power) {
            result *= base;
            i++;
        }

        System.out.println("Result = " + result);
    }
}