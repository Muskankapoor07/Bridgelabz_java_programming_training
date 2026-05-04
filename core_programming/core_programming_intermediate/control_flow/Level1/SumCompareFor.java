package core_programming.core_programming_intermediate.control_flow.Level1;

import java.util.Scanner;

class SumCompareFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int formula = n * (n + 1) / 2;

        System.out.println("For loop sum = " + sum);
        System.out.println("Formula sum = " + formula);
    }
}
