import java.util.Scanner;

class NumberArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (n > 0) {
                System.out.println(n + (n % 2 == 0 ? " Even" : " Odd"));
            } else if (n < 0) {
                System.out.println(n + " Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (arr[0] == arr[4])
            System.out.println("First and Last are Equal");
        else if (arr[0] > arr[4])
            System.out.println("First is Greater");
        else
            System.out.println("Last is Greater");
    }
}