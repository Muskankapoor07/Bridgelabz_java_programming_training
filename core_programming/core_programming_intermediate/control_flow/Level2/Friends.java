package core_programming.core_programming_intermediate.control_flow.Level2;

import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age1 = input.nextInt();
        int age2 = input.nextInt();
        int age3 = input.nextInt();

        int h1 = input.nextInt();
        int h2 = input.nextInt();
        int h3 = input.nextInt();

        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(h1, Math.max(h2, h3));

        System.out.println("Youngest age = " + youngest);
        System.out.println("Tallest height = " + tallest);
    }
}
