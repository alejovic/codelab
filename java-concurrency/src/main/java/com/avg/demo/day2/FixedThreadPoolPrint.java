package com.avg.demo.day2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 1. Rewrite: Two Threads Printing Numbers (Using Thread Pool)
public class FixedThreadPoolPrint {

    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {

            Runnable task = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-" + i);
                }
            };

            executor.submit(task);
            executor.submit(task);

            executor.shutdown();
        }
    }

}
