package core_programming.core_programming_intermediate.control_flow.Level1;

import java.util.Scanner;

class SumBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;

        while (true) {
            double num = input.nextDouble();
            if (num <= 0)
                break;

            sum += num;
        }

        System.out.println("Total sum = " + sum);
    }
}