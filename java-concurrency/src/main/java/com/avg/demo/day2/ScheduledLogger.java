package com.avg.demo.day2;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//3. Rewrite: Daemon-Like Periodic Logger (Simulated)
//Note: ExecutorService doesn't support daemon threads directly,
// but we can simulate periodic logging with ScheduledExecutorService.
public class ScheduledLogger {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable logger = () -> System.out.println("Current time: " + LocalDateTime.now());

        scheduler.scheduleAtFixedRate(logger, 0, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(15000); // Let logger run for 15 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        scheduler.shutdown();
        System.out.println("Main thread finished.");
    }
}
