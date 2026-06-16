import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        String regex =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        boolean result =
                Pattern.matches(regex, email);

        if(result) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}