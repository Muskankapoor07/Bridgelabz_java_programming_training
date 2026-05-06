package core_programming.core_programming_intermediate.String.Level2;

import java.util.Scanner;

class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        double percentage = (physics + chemistry + maths) / 3.0;

        char grade;

        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'R';
        }

        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
