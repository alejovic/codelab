package com.avg.demo.patterns.behavioral.observer.push_based;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void updateObserver(String data) {
        observers.forEach(observer -> observer.update(data));
    }
}
