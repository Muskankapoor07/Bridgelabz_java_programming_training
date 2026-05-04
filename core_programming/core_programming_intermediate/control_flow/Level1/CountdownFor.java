package core_programming.core_programming_intermediate.control_flow.Level1;

import java.util.Scanner;

class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
