import java.util.Scanner;

class Array2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        int[] arr = new int[rows * cols];
        int k = 0;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[k++] = matrix[i][j];

        System.out.println("1D Array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}