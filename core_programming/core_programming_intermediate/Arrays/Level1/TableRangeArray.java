import java.util.Scanner;

class TableRangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[4];

        int index = 0;
        for (int i = 6; i <= 9; i++) {
            result[index++] = n * i;
        }

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + result[index++]);
        }
    }
}