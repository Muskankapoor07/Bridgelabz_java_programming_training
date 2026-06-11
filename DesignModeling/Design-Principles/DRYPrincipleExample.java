public class DRYPrincipleExample {

    public static void printSum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        printSum(10, 20);
        printSum(30, 40);
        printSum(50, 60);
    }
}