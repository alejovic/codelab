package com.avg.demo.day1;

//  1. Create two threads that print numbers from 1 to 10
public class NumberPrinter {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
