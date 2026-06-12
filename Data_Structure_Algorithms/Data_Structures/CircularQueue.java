public class CircularQueue {

    int[] queue = new int[5];
    int front = 0;
    int rear = 0;

    void enqueue(int data) {

        queue[rear] = data;
        rear = (rear + 1) % queue.length;
    }

    int dequeue() {

        int data = queue[front];
        front = (front + 1) % queue.length;

        return data;
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);

        System.out.println(q.dequeue());
    }
}