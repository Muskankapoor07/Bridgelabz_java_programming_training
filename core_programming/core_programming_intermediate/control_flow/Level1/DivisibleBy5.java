package core_programming.core_programming_intermediate.control_flow.Level1;

import java.util.Scanner;

class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n % 5 == 0)
            System.out.println("Is the number " + n + " divisible by 5? Yes");
        else
            System.out.println("Is the number " + n + " divisible by 5? No");
    }
}
