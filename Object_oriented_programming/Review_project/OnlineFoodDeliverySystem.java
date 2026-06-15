import java.util.*;

// ================= USER =================

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }
}

// ================= CUSTOMER =================

class Customer extends User {

    Cart cart = new Cart();

    public Customer(String name) {
        super(name);
    }

    public void searchRestaurant(String restaurant) {
        System.out.println("Searching Restaurant: " + restaurant);
    }

    public void placeOrder(Order order) {
        System.out.println("Order Placed Successfully");
        order.displayOrder();
    }
}

// ================= ADMIN =================

class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    public void addMenuItem(FoodItem item) {
        System.out.println(item.getName() + " added to menu.");
    }

    public void updateMenuItem(FoodItem item) {
        System.out.println(item.getName() + " updated.");
    }
}

// ================= DELIVERY PARTNER =================

class DeliveryPartner extends User {

    public DeliveryPartner(String name) {
        super(name);
    }

    public void acceptDelivery() {
        System.out.println("Delivery Accepted.");
    }

    public void updateStatus(String status) {
        System.out.println("Delivery Status: " + status);
    }
}

// ================= FOOD ITEM =================

class FoodItem {

    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

// ================= CART (COMPOSITION) =================

class Cart {

    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public double calculateTotal() {

        double total = 0;

        for(FoodItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public void displayCart() {

        System.out.println("\nCart Items:");

        for(FoodItem item : items) {
            System.out.println(item);
        }

        System.out.println("Total = ₹" + calculateTotal());
    }
}

// ================= ORDER (ENCAPSULATION) =================

class Order {

    private int orderId;
    private double amount;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void displayOrder() {

        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Amount: ₹" + amount);
    }
}

// ================= ABSTRACTION =================

abstract class Payment {

    public abstract void pay(double amount);
}

// ================= POLYMORPHISM =================

class UPIPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CardPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

class WalletPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}

// ================= MAIN CLASS =================

public class OnlineFoodDeliverySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer("Muskan");
        Admin admin = new Admin("Admin");
        DeliveryPartner partner = new DeliveryPartner("Rohit");

        FoodItem pizza = new FoodItem("Pizza", 299);
        FoodItem burger = new FoodItem("Burger", 149);

        admin.addMenuItem(pizza);
        admin.addMenuItem(burger);

        customer.searchRestaurant("Dominos");

        customer.cart.addItem(pizza);
        customer.cart.addItem(burger);

        customer.cart.displayCart();

        double total = customer.cart.calculateTotal();

        Order order = new Order(101, total);

        customer.placeOrder(order);

        System.out.println("\nSelect Payment Method");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Wallet");

        int choice = sc.nextInt();

        Payment payment;

        switch(choice) {

            case 1:
                payment = new UPIPayment();
                break;

            case 2:
                payment = new CardPayment();
                break;

            case 3:
                payment = new WalletPayment();
                break;

            default:
                payment = new UPIPayment();
        }

        payment.pay(total);

        partner.acceptDelivery();
        partner.updateStatus("Out For Delivery");
        partner.updateStatus("Delivered");
    }
}