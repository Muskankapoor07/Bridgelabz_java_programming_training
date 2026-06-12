import java.util.*;

// =========================
// Employee Record Management
// =========================
class Employee {
    int id;
    String name;
    Employee next;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// =========================
// Playlist Management
// =========================
class Song {
    String title;
    Song next;

    Song(String title) {
        this.title = title;
    }
}

public class DataStructureApplications {

    // Employee Linked List
    static Employee empHead = null;

    static void addEmployee(int id, String name) {

        Employee newEmp = new Employee(id, name);

        if (empHead == null) {
            empHead = newEmp;
            return;
        }

        Employee temp = empHead;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newEmp;
    }

    static void displayEmployees() {

        Employee temp = empHead;

        while (temp != null) {
            System.out.println(temp.id + " - " + temp.name);
            temp = temp.next;
        }
    }

    // Circular Playlist
    static Song head = null;
    static Song tail = null;

    static void addSong(String title) {

        Song newSong = new Song(title);

        if (head == null) {
            head = tail = newSong;
            tail.next = head;
        } else {
            tail.next = newSong;
            tail = newSong;
            tail.next = head;
        }
    }

    static void displayPlaylist() {

        if (head == null)
            return;

        Song temp = head;

        do {
            System.out.println(temp.title);
            temp = temp.next;
        } while (temp != head);
    }

    // Balanced Parentheses
    static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {

                if (stack.isEmpty()) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println("===== Employee Management =====");
        addEmployee(101, "Muskan");
        addEmployee(102, "Rahul");
        displayEmployees();

        System.out.println("\n===== Playlist Management =====");
        addSong("Shape of You");
        addSong("Believer");
        addSong("Perfect");
        displayPlaylist();

        System.out.println("\n===== Parentheses Checker =====");
        System.out.println(isBalanced("(())()"));

        System.out.println("\n===== Ticket Counter Queue =====");
        Queue<String> queue = new LinkedList<>();

        queue.add("Customer1");
        queue.add("Customer2");
        queue.add("Customer3");

        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }

        System.out.println("\n===== Browser Navigation Stack =====");

        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("GitHub");

        System.out.println("Current Page: " + history.peek());
        history.pop();
        System.out.println("After Back: " + history.peek());

        System.out.println("\n===== Student Database HashMap =====");

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Muskan");
        students.put(102, "Rahul");

        System.out.println(students);

        System.out.println("\n===== Word Frequency Counter =====");

        String text = "java is easy java is powerful";

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : text.split(" ")) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequency);

        System.out.println("\n===== Phone Directory =====");

        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Muskan", "9876543210");
        contacts.put("Rahul", "9876501234");

        System.out.println("Muskan : " + contacts.get("Muskan"));
    }
}