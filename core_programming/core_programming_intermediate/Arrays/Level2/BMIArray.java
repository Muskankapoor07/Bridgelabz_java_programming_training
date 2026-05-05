package core_programming.core_programming_intermediate.Arrays.Level2;

import java.util.Scanner;

class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextDouble();
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            String status;

            if (bmi[i] <= 18.4)
                status = "Underweight";
            else if (bmi[i] <= 24.9)
                status = "Normal";
            else if (bmi[i] <= 39.9)
                status = "Overweight";
            else
                status = "Obese";

            System.out.println("BMI: " + bmi[i] + " Status: " + status);
        }
    }
}