package com.avg.demo.patterns.behavioral.observer.push_based;

public class EmailDispatcher implements Observer {
    @Override
    public void update(String data) {
        System.out.println("DiskDispatcher.update: " + data);
    }
}
