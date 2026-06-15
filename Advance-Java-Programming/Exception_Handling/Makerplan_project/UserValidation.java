import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UserValidation {

    public static void validateAge(int age)
            throws InvalidAgeException {

        if(age < 18) {
            throw new InvalidAgeException(
                    "Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            validateAge(age);

            System.out.println(
                    "Valid Age");

        } catch(InvalidAgeException e) {

            System.out.println(
                    e.getMessage());
        }
    }
}