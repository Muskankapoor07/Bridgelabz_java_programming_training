package com.multithreading.lifecycle;

public class ThreadStateDemo {

    public static void demonstrateStates()
            throws Exception {

        Object lock = new Object();

        Thread t = new Thread(() -> {

            try {

                Thread.sleep(100);

                synchronized (lock) {

                    lock.wait();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println(
                "\nNEW : "
                        + t.getState());

        t.start();

        System.out.println(
                "RUNNABLE : "
                        + t.getState());

        Thread.sleep(50);

        System.out.println(
                "TIMED_WAITING : "
                        + t.getState());

        Thread.sleep(100);

        System.out.println(
                "WAITING : "
                        + t.getState());

        synchronized (lock) {

            lock.notify();
        }

        t.join();

        System.out.println(
                "TERMINATED : "
                        + t.getState());
    }
}