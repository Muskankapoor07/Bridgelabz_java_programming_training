package core_programming.core_programming_intermediate.Arrays.Level2;

import java.util.Scanner;

class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int largest = 0, second = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;
            }

            num /= 10;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}
