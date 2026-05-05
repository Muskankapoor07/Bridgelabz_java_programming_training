import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];

        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double h : heights) {
            sum += h;
        }

        double mean = sum / 11;

        System.out.println("Mean height = " + mean);
    }
}