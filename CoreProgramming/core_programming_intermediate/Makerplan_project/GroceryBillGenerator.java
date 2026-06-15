import java.util.Scanner;

public class GroceryBillGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Rice Quantity (kg): ");
            int riceQty = sc.nextInt();

            System.out.print("Enter Sugar Quantity (kg): ");
            int sugarQty = sc.nextInt();

            System.out.print("Enter Oil Quantity (litre): ");
            int oilQty = sc.nextInt();

            double ricePrice = 50;
            double sugarPrice = 40;
            double oilPrice = 120;

            double totalBill =
                    (riceQty * ricePrice)
                    + (sugarQty * sugarPrice)
                    + (oilQty * oilPrice);

            System.out.println("\n===== BILL =====");
            System.out.println("Rice : ₹" +
                    (riceQty * ricePrice));

            System.out.println("Sugar : ₹" +
                    (sugarQty * sugarPrice));

            System.out.println("Oil : ₹" +
                    (oilQty * oilPrice));

            System.out.println("----------------");
            System.out.println("Total Bill = ₹" +
                    totalBill);

        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }
    }
}