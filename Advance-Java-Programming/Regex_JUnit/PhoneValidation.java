import java.util.Scanner;
import java.util.regex.*;

public class PhoneValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        String regex = "^[0-9]{10}$";

        Pattern pattern =
                Pattern.compile(regex);

        Matcher matcher =
                pattern.matcher(phone);

        if(matcher.matches()) {

            System.out.println(
                    "Valid Phone Number");
        }
        else {

            System.out.println(
                    "Invalid Phone Number");
        }
    }
}