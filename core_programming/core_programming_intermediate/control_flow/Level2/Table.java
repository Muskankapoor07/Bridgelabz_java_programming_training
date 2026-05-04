package core_programming.core_programming_intermediate.control_flow.Level2;

import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}