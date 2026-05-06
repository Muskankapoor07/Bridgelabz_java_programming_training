import java.util.Scanner;

class GroceryBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            String[] items = new String[3];
            double[] prices = new double[3];
            int[] quantity = new int[3];

            double total = 0;

            for (int i = 0; i < 3; i++) {

                System.out.print("Enter item name: ");
                items[i] = sc.next();

                System.out.print("Enter price: ");
                prices[i] = sc.nextDouble();

                if (prices[i] < 0) {
                    throw new Exception("Price cannot be negative");
                }

                System.out.print("Enter quantity: ");
                quantity[i] = sc.nextInt();

                if (quantity[i] < 0) {
                    throw new Exception("Quantity cannot be negative");
                }

                total += prices[i] * quantity[i];
            }

            System.out.println("\n------ BILL ------");

            for (int i = 0; i < 3; i++) {
                System.out.println(items[i] + " = " +
                        prices[i] + " x " +
                        quantity[i] + " = " +
                        (prices[i] * quantity[i]));
            }

            System.out.println("------------------");
            System.out.println("Total Bill = " + total);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();
    }
}