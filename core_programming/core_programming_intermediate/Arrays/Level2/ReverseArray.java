import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[10];
        int i = 0;

        while (num > 0) {
            arr[i++] = num % 10;
            num /= 10;
        }

        System.out.println("Reversed:");
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}