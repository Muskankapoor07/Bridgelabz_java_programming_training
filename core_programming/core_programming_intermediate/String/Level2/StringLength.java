package core_programming.core_programming_intermediate.String.Level2;

import java.util.Scanner;

class StringLength {

    static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println("Custom Length: " + findLength(text));
        System.out.println("Built-in Length: " + text.length());
    }
}
