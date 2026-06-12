class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CircularLinkedList {

    Node head = null;
    Node tail = null;

    void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void display() {

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
    }
}