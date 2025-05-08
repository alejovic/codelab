package com.avg.demo.day1;

public class Test {

    static class MyThread extends Thread {
        int identifier;

        public MyThread(int identifier) {
            this.identifier = identifier;
        }

        @Override
        public void run() {
            System.out.println("Thread is starting " + identifier);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted" + identifier);
            }
            System.out.println("Thread is done " + identifier);
        }
    }

    public static void thread(String[] args) {
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("All threads have finished");

    }

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.yield(); // Suggest giving up CPU
            }
        };

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();
    }
}
