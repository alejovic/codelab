package com.avg.demo.patterns.behavioral.observer.push_based;

public class SMSDispatcher implements Observer {
    @Override
    public void update(String data) {
        System.out.println("SMSDispatcher.update: " + data);
    }
}
