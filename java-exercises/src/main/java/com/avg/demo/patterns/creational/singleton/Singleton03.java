package com.avg.demo.patterns.creational.singleton;

// version 3 synchronized
public class Singleton03 {

    public static Singleton03 INSTANCE = null;

    private Singleton03() {

    }

    public static synchronized Singleton03 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }
}
