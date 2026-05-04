package core_programming.core_programming_intermediate.control_flow.Level2;

import java.util.Scanner;

class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int gf = 1;

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                gf = i;
                break;
            }
        }

        System.out.println("Greatest factor = " + gf);
    }
}
