import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class SafeSingleton {

    private static SafeSingleton instance;

    private SafeSingleton() {

        System.out.println(
                "Singleton Object Created By: "
                        + Thread.currentThread().getName()
        );
    }

    public static synchronized
    SafeSingleton getInstance() {

        if (instance == null) {

            instance = new SafeSingleton();
        }

        return instance;
    }
}

public class ThreadSafeSingleton {

    public static void main(String[] args)
            throws InterruptedException {

        Set<Integer> objects =
                ConcurrentHashMap.newKeySet();

        Thread[] threads = new Thread[100];

        for (int i = 0; i < threads.length; i++) {

            threads[i] = new Thread(() -> {

                SafeSingleton object =
                        SafeSingleton.getInstance();

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