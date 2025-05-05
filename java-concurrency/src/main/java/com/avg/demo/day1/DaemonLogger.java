package com.avg.demo.day1;

import java.time.LocalDateTime;

//  3. Create a daemon thread that logs the current time every 5 seconds
public class DaemonLogger {
    public static void main(String[] args) {
        Runnable logger = () -> {
            while (true) {
                System.out.println("Current time: " + LocalDateTime.now());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        };

        Thread daemonThread = new Thread(logger);
        daemonThread.setDaemon(true); // Set as daemon
        daemonThread.start();

        System.out.println("Main thread sleeping for 15 seconds...");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread finished.");
    }
}
