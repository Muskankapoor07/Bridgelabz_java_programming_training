public class ArrayQueue {

    int[] queue = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int data) {
        queue[++rear] = data;
    }

    int dequeue() {
        return queue[front++];
    }

    public static void main(String[] args) {

        ArrayQueue q = new ArrayQueue();

        q.enqueue(10);
        q.enqueue(20);

        System.out.println(q.dequeue());
    }
}