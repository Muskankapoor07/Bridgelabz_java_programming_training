package core_programming.core_programming_intermediate.control_flow.Level2;

import java.util.Scanner;

class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base = input.nextInt();
        int power = input.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println("Result = " + result);
    }
}
