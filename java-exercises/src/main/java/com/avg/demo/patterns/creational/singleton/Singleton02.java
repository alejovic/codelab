package com.avg.demo.patterns.creational.singleton;

// version 2 only when needed - Lazy Initialization
public class Singleton02 {

    public static Singleton02 INSTANCE = null;

    private Singleton02() {

    }

    public static Singleton02 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }
}
