package com.avg.demo.day1;

public class RaceConditionFixed {

    private static int counter = 0;

    private static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 50; i++) {
                increment();
                System.out.println(Thread.currentThread().getName() + " - Counter: " + counter);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter (fixed): " + counter);
    }
}
