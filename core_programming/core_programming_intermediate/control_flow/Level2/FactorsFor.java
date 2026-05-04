package core_programming.core_programming_intermediate.control_flow.Level2;

import java.util.Scanner;

class FactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}