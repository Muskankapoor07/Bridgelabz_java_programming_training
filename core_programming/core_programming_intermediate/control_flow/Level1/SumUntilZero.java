package core_programming.core_programming_intermediate.control_flow.Level1;

import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        double num = input.nextDouble();

        while (num != 0) {
            sum += num;
            num = input.nextDouble();
        }

        System.out.println("Total sum = " + sum);
    }
}
