package com.multithreading.singleton;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonConcurrencyDemo {

    public static void runDemo()
            throws Exception {

        Set<Integer> unsafe =
                ConcurrentHashMap.newKeySet();

        Thread[] t1 = new Thread[50];

        for (int i = 0; i < 50; i++) {

            t1[i] = new Thread(() -> {

                unsafe.add(
                        UnsafeSingleton
                                .getInstance()
                                .hashCode());
            });

            t1[i].start();
        }

        for (Thread t : t1) {
            t.join();
        }

        System.out.println(
                "\nUnsafe Instances : "
                        + unsafe.size());

        Set<Integer> safe =
                ConcurrentHashMap.newKeySet();

        Thread[] t2 = new Thread[50];

        for (int i = 0; i < 50; i++) {

            t2[i] = new Thread(() -> {

                safe.add(
                        SafeSingleton
                                .getInstance()
                                .hashCode());
            });

            t2[i].start();
        }

        for (Thread t : t2) {
            t.join();
        }

        System.out.println(
                "Safe Instances : "
                        + safe.size());
    }
}