import java.util.*;
import java.io.*;

public class AdvancedJavaPrograms {

    static Scanner sc = new Scanner(System.in);

    // ================= EMPLOYEE RECORDS =================

    static HashMap<Integer, String> employees =
            new HashMap<>();

    public static void employeeRecords() {

        employees.put(101, "Muskan - IT");
        employees.put(102, "Rahul - HR");
        employees.put(103, "Aman - Finance");

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        if(employees.containsKey(id)) {

            System.out.println(
                    "Employee Found: "
                            + employees.get(id));
        }
        else {

            System.out.println(
                    "Employee Not Found");
        }
    }

    // ================= LINKED LIST =================

    public static void removeOccurrences() {

        LinkedList<Integer> list =
                new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(10);

        System.out.println(
                "Original List: " + list);

        System.out.print(
                "Enter Value To Remove: ");

        int value = sc.nextInt();

        list.removeIf(
                num -> num == value);

        System.out.println(
                "Updated List: " + list);
    }

    // ================= STACK =================

    public static void balancedParentheses() {

        sc.nextLine();

        System.out.print(
                "Enter Expression: ");

        String expression =
                sc.nextLine();

        Stack<Character> stack =
                new Stack<>();

        boolean balanced = true;

        for(char ch :
                expression.toCharArray()) {

            if(ch == '(') {

                stack.push(ch);
            }

            else if(ch == ')') {

                if(stack.isEmpty()) {

                    balanced = false;
                    break;
                }

                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            balanced = false;
        }

        if(balanced) {

            System.out.println(
                    "Balanced Expression");
        }
        else {

            System.out.println(
                    "Not Balanced");
        }
    }

    // ================= QUEUE =================

    public static void printerQueue() {

        Queue<String> queue =
                new LinkedList<>();

        queue.offer("Document1");
        queue.offer("Document2");
        queue.offer("Document3");

        System.out.println(
                "\nPrinter Queue:");

        while(!queue.isEmpty()) {

            System.out.println(
                    "Printing: "
                            + queue.poll());
        }
    }

    // ================= FILE HANDLING =================

    static final String FILE =
            "addressbook.txt";

    public static void addContact()
            throws Exception {

        sc.nextLine();

        System.out.print(
                "Enter Contact Name: ");

        String name =
                sc.nextLine();

        FileWriter writer =
                new FileWriter(
                        FILE, true);

        writer.write(name + "\n");

        writer.close();

        System.out.println(
                "Contact Saved");
    }

    public static void displayContacts()
            throws Exception {

        File file =
                new File(FILE);

        if(!file.exists()) {

            System.out.println(
                    "No Contacts Found");
            return;
        }

        BufferedReader reader =
                new BufferedReader(
                        new FileReader(FILE));

        String line;

        System.out.println(
                "\nAddress Book:");

        while((line = reader.readLine())
                != null) {

            System.out.println(line);
        }

        reader.close();
    }

    // ================= MAIN MENU =================

    public static void main(String[] args)
            throws Exception {

        while(true) {

            System.out.println(
                    "\n===== ADVANCED JAVA PROGRAMS =====");

            System.out.println(
                    "1. Employee Records (HashMap)");

            System.out.println(
                    "2. Remove Occurrences (LinkedList)");

            System.out.println(
                    "3. Balanced Parentheses (Stack)");

            System.out.println(
                    "4. Printer Queue (Queue)");

            System.out.println(
                    "5. Add Contact To File");

            System.out.println(
                    "6. Display Contacts");

            System.out.println(
                    "7. Exit");

            System.out.print(
                    "Enter Choice: ");

            int choice =
                    sc.nextInt();

            switch(choice) {

                case 1:
                    employeeRecords();
                    break;

                case 2:
                    removeOccurrences();
                    break;

                case 3:
                    balancedParentheses();
                    break;

                case 4:
                    printerQueue();
                    break;

                case 5:
                    addContact();
                    break;

                case 6:
                    displayContacts();
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println(
                            "Invalid Choice");
            }
        }
    }
}