import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue =
                new LinkedList<>();

        queue.offer("A");
        queue.offer("B");

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
    }
}