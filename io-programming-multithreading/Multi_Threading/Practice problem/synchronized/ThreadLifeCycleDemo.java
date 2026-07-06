public class ThreadLifeCycleDemo {

    public static void main(String[] args)
            throws InterruptedException {

        Thread worker = new Thread(() -> {

            System.out.println(
                    "Worker thread started"
            );

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
            }

            System.out.println(
                    "Worker thread finished"
            );

        }, "WorkerThread");

        // NEW
        System.out.println(
                "State after creation: "
                        + worker.getState()
        );

        worker.start();

        // RUNNABLE
        System.out.println(
                "State after start(): "
                        + worker.getState()
        );

        Thread.sleep(500);

        // TIMED_WAITING
        System.out.println(
                "State during sleep(): "
                        + worker.getState()
        );

        worker.join();

        // TERMINATED
        System.out.println(
                "State after completion: "
                        + worker.getState()
        );
    }
}