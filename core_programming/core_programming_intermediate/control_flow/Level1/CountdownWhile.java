package core_programming.core_programming_intermediate.control_flow.Level1;

import java.util.Scanner;

class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}