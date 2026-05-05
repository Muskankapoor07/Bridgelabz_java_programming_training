package core_programming.core_programming_intermediate.Arrays.Level2;

import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double p = sc.nextDouble();
            double c = sc.nextDouble();
            double m = sc.nextDouble();

            double percent = (p + c + m) / 3;

            char grade;

            if (percent >= 80)
                grade = 'A';
            else if (percent >= 70)
                grade = 'B';
            else if (percent >= 60)
                grade = 'C';
            else if (percent >= 50)
                grade = 'D';
            else if (percent >= 40)
                grade = 'E';
            else
                grade = 'R';

            System.out.println("Percentage=" + percent + " Grade=" + grade);
        }
    }
}