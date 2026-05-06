package core_programming.core_programming_intermediate.String.Level2;

import java.util.Scanner;

class SplitWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = text.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
