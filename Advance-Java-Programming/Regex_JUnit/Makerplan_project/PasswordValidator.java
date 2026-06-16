import java.util.Scanner;
import java.util.regex.*;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        String regex =
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";

        Pattern pattern =
                Pattern.compile(regex);

        Matcher matcher =
                pattern.matcher(password);

        if(matcher.matches()) {

            System.out.println(
                    "Strong Password");
        }
        else {

            System.out.println(
                    "Weak Password");
        }
    }
}