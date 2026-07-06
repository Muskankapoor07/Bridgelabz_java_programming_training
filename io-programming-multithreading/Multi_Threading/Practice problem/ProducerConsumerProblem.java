import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {

    private final Queue<Integer> buffer
            = new LinkedList<>();

    private final int CAPACITY = 3;

    public synchronized void produce(int value)
            throws InterruptedException {

        while (buffer.size() == CAPACITY) {

            System.out.println(
                    "Buffer Full -> Producer Waiting"
            );

            wait();
        }

        buffer.add(value);

        System.out.println(
                "Produced: " + value
                        + " | Buffer: " + buffer
        );

        notifyAll();
    }

    public synchronized int consume()
            throws InterruptedException {

        while (buffer.isEmpty()) {

            System.out.println(
                    "Buffer Empty -> Consumer Waiting"
            );

            wait();
        }

        int value = buffer.poll();

        System.out.println(
                "Consumed: " + value
                        + " | Buffer: " + buffer
        );

        notifyAll();

        return value;
    }
}

public class ProducerConsumerProblem {

    public static void main(String[] args)
            throws InterruptedException {

        SharedBuffer sharedBuffer = new SharedBuffer();

        Thread producer = new Thread(() -> {

            try {

                for (int i = 1; i <= 10; i++) {

                    sharedBuffer.produce(i);

                    Thread.sleep(300);
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }, "Producer");

        Thread consumer = new Thread(() -> {

            try {

                for (int i = 1; i <= 10; i++) {

                    sharedBuffer.consume();

                    Thread.sleep(700);
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }, "Consumer");

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println(
                "Producer Consumer Process Completed"
        );
    }
}