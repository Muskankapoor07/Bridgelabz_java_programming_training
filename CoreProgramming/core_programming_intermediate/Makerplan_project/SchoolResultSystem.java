import java.util.Scanner;

public class SchoolResultSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks in Subject 1: ");
            int m1 = sc.nextInt();

            System.out.print("Enter Marks in Subject 2: ");
            int m2 = sc.nextInt();

            System.out.print("Enter Marks in Subject 3: ");
            int m3 = sc.nextInt();

            double total = m1 + m2 + m3;
            double percentage = total / 3;

            System.out.println("\nStudent: " + name);
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage);

            if (percentage >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }

        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }
    }
}