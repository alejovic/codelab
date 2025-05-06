package com.avg.demo.day2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 2. Rewrite: Shared Counter with Synchronization
public class FixedThreadPoolCounter {

    private static int counter = 0;

    private static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        };

        executor.execute(task);
        executor.execute(task);

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for completion
        }

        System.out.println("Final counter: " + counter);
    }
}
