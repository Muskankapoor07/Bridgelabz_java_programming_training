package com.multithreading;

import com.multithreading.lifecycle.ThreadStateDemo;
import com.multithreading.producerconsumer.ProducerConsumerDemo;
import com.multithreading.singleton.SingletonConcurrencyDemo;

public class Main {

    public static void main(String[] args)
            throws Exception {

        ThreadStateDemo
                .demonstrateStates();

        ProducerConsumerDemo
                .runTraditionalDemo();

        ProducerConsumerDemo
                .runVirtualThreadDemo();

        SingletonConcurrencyDemo
                .runDemo();
    }
}