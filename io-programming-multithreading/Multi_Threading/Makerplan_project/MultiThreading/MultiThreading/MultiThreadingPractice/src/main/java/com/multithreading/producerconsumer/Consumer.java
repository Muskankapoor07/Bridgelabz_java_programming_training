package com.multithreading.producerconsumer;

public class Consumer implements Runnable {

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 10; i++) {

                buffer.consume();

                Thread.sleep(150);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}