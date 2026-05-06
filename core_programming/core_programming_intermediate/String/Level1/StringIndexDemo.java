package core_programming.core_programming_intermediate.String.Level1;

import java.util.Scanner;

class StringIndexDemo {

    static void handleException(String text) {

        try {

            System.out.println(text.charAt(100));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("StringIndexOutOfBoundsException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        handleException(text);
    }
}