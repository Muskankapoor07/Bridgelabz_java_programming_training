package core_programming.core_programming_intermediate.control_flow.Level1;

import java.util.Scanner;

class FirstSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a < b && a < c)
            System.out.println("Is the first number smallest? Yes");
        else
            System.out.println("Is the first number smallest? No");
    }
}
