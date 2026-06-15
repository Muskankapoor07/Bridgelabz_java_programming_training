import java.util.Scanner;

public class SplitTextProgram {

    public static String[] splitText(String text) {

        int wordCount = 1;

        for(int i = 0; i < text.length(); i++) {

            if(text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int index = 0;
        String word = "";

        for(int i = 0; i < text.length(); i++) {

            if(text.charAt(i) != ' ') {

                word += text.charAt(i);

            } else {

                words[index] = word;
                index++;
                word = "";
            }
        }

        words[index] = word;

        return words;
    }

    public static boolean compareArrays(
            String[] arr1,
            String[] arr2) {

        if(arr1.length != arr2.length) {
            return false;
        }

        for(int i = 0; i < arr1.length; i++) {

            if(!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] userWords = splitText(text);

        String[] builtInWords = text.split(" ");

        System.out.println("\nWords Using User Method:");

        for(String word : userWords) {
            System.out.println(word);
        }

        System.out.println(
                "\nArrays Equal? "
                        + compareArrays(
                        userWords,
                        builtInWords));
    }
}