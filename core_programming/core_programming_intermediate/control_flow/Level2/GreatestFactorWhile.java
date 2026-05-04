package core_programming.core_programming_intermediate.control_flow.Level2;

import java.util.Scanner;

class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int i = n - 1;

        while (i >= 1) {
            if (n % i == 0) {
                System.out.println("Greatest factor = " + i);
                break;
            }
            i--;
        }
    }
}
