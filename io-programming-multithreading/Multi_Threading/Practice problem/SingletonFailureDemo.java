import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class UnsafeSingleton {

    private static UnsafeSingleton instance;

    private UnsafeSingleton() {
        System.out.println(
                "Object Created By: "
                        + Thread.currentThread().getName()
        );
    }

    public static UnsafeSingleton getInstance() {

        if (instance == null) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            instance = new UnsafeSingleton();
        }

        return instance;
    }
}

public class SingletonFailureDemo {

    public static void main(String[] args)
            throws InterruptedException {

        Set<Integer> objects =
                ConcurrentHashMap.newKeySet();

        Thread[] threads = new Thread[100];

        for (int i = 0; i < threads.length; i++) {

            threads[i] = new Thread(() -> {

                UnsafeSingleton object =
                        UnsafeSingleton.getInstance();

                objects.add(
                        System.identityHashCode(object)
                );

            }, "Thread-" + i);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println(
                "Total Different Objects: "
                        + objects.size()
        );

        System.out.println(
                "Object IDs: " + objects
        );
    }
}