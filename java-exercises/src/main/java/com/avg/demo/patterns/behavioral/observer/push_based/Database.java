package com.avg.demo.patterns.behavioral.observer.push_based;

public class Database extends Subject {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        // reuse. . .
        updateObserver(data);
    }
}
