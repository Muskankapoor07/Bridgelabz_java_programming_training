import java.util.*;

class Passenger {
    int id;
    String name;
    int age;
    String source;
    String destination;
    double wallet;

    Passenger(int id, String name, int age,
              String source, String destination,
              double wallet) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.source = source;
        this.destination = destination;
        this.wallet = wallet;
    }

    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Source: " + source +
                ", Destination: " + destination +
                ", Wallet: " + wallet;
    }
}

public class SmartMetroRailPassengerManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Passenger> passengers = new ArrayList<>();
    static Queue<String> bookingQueue = new LinkedList<>();
    static Stack<String> stationHistory = new Stack<>();
    static HashMap<String, Integer> stationCount = new HashMap<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== SMART METRO SYSTEM =====");
            System.out.println("1. Add Passenger");
            System.out.println("2. Display Passengers");
            System.out.println("3. Search Passenger");
            System.out.println("4. Remove Passenger");
            System.out.println("5. Ticket Booking Queue");
            System.out.println("6. Station History");
            System.out.println("7. Travel Analytics");
            System.out.println("8. Sort By Age");
            System.out.println("9. Binary Search Passenger");
            System.out.println("10. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addPassenger();
                    break;

                case 2:
                    displayPassengers();
                    break;

                case 3:
                    searchPassenger();
                    break;

                case 4:
                    removePassenger();
                    break;

                case 5:
                    bookingMenu();
                    break;

                case 6:
                    stationMenu();
                    break;

                case 7:
                    analyticsMenu();
                    break;

                case 8:
                    sortByAge();
                    break;

                case 9:
                    binarySearchPassenger();
                    break;

                case 10:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // ================= PASSENGER =================

    static void addPassenger() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Passenger p : passengers) {
            if (p.id == id) {
                System.out.println("ID Already Exists!");
                return;
            }
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("Name Cannot Be Empty");
            return;
        }

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Source Station: ");
        String source = sc.nextLine();

        System.out.print("Destination Station: ");
        String destination = sc.nextLine();

        System.out.print("Wallet Balance: ");
        double wallet = sc.nextDouble();

        if (wallet < 0) {
            System.out.println("Wallet Cannot Be Negative");
            return;
        }

        Passenger p =
                new Passenger(id, name, age,
                        source, destination, wallet);

        passengers.add(p);

        System.out.println("Passenger Added Successfully");
    }

    static void displayPassengers() {

        if (passengers.isEmpty()) {
            System.out.println("No Passengers Found");
            return;
        }

        for (Passenger p : passengers) {
            System.out.println(p);
        }
    }

    static void searchPassenger() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Passenger p : passengers) {

            if (p.id == id) {
                System.out.println(p);
                return;
            }
        }

        System.out.println("Passenger Not Found");
    }

    static void removePassenger() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        Iterator<Passenger> it = passengers.iterator();

        while (it.hasNext()) {

            Passenger p = it.next();

            if (p.id == id) {
                it.remove();
                System.out.println("Passenger Removed");
                return;
            }
        }

        System.out.println("Passenger Not Found");
    }

    // ================= QUEUE =================

    static void bookingMenu() {

        System.out.println("1. Add Booking");
        System.out.println("2. Process Booking");
        System.out.println("3. View Next Booking");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {

            case 1:
                System.out.print("Passenger Name: ");
                bookingQueue.offer(sc.nextLine());
                break;

            case 2:

                if (bookingQueue.isEmpty())
                    System.out.println("Queue Empty");
                else
                    System.out.println(
                            "Processed: "
                                    + bookingQueue.poll());
                break;

            case 3:

                System.out.println(
                        bookingQueue.peek());
                break;
        }
    }

    // ================= STACK =================

    static void stationMenu() {

        System.out.println("1. Add Station");
        System.out.println("2. Undo Last Station");
        System.out.println("3. Display History");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {

            case 1:

                System.out.print("Station Name: ");
                stationHistory.push(sc.nextLine());
                break;

            case 2:

                if (stationHistory.isEmpty())
                    System.out.println("No History");
                else
                    System.out.println(
                            "Removed: "
                                    + stationHistory.pop());
                break;

            case 3:

                System.out.println(stationHistory);
                break;
        }
    }

    // ================= HASHMAP =================

    static void analyticsMenu() {

        System.out.println("1. Add Station Visit");
        System.out.println("2. Display Analytics");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {

            case 1:

                System.out.print("Station: ");
                String station = sc.nextLine();

                stationCount.put(
                        station,
                        stationCount.getOrDefault(
                                station, 0) + 1);

                break;

            case 2:

                for (String s : stationCount.keySet()) {

                    System.out.println(
                            s + " -> "
                                    + stationCount.get(s)
                                    + " passengers");
                }

                break;
        }
    }

    // ================= BUBBLE SORT =================

    static void sortByAge() {

        for (int i = 0; i < passengers.size() - 1; i++) {

            for (int j = 0; j < passengers.size() - i - 1; j++) {

                if (passengers.get(j).age >
                        passengers.get(j + 1).age) {

                    Passenger temp = passengers.get(j);

                    passengers.set(
                            j,
                            passengers.get(j + 1));

                    passengers.set(
                            j + 1,
                            temp);
                }
            }
        }

        System.out.println("Sorted By Age");

        displayPassengers();
    }

    // ================= BINARY SEARCH =================

    static void binarySearchPassenger() {

        passengers.sort(
                Comparator.comparingInt(p -> p.id));

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        int low = 0;
        int high = passengers.size() - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (passengers.get(mid).id == id) {

                System.out.println(
                        passengers.get(mid));

                return;
            }

            if (passengers.get(mid).id < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println("Passenger Not Found");
    }
}