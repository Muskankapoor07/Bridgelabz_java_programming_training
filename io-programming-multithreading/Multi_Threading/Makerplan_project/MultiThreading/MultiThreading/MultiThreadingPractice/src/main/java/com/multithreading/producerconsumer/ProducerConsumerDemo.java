package com.multithreading.producerconsumer;

public class ProducerConsumerDemo {

    public static void runTraditionalDemo()
            throws Exception {

        System.out.println(
                "\nTraditional Threads");

        Buffer buffer = new Buffer();

        Producer producer =
                new Producer(buffer);

        Thread consumer =
                new Thread(
                        new Consumer(buffer));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }

    public static void runVirtualThreadDemo()
            throws Exception {

        System.out.println(
                "\nVirtual Threads");

        Buffer buffer = new Buffer();

        Thread producer =
                Thread.ofVirtual().start(() -> {

                    try {

                        for (int i = 1; i <= 10; i++) {

                            buffer.produce(i);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

        Thread consumer =
                Thread.ofVirtual().start(() -> {

                    try {

                        for (int i = 1; i <= 10; i++) {

                            buffer.consume();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

        producer.join();
        consumer.join();
    }
}