package com.avg.demo.patterns.creational.singleton;

public class Singleton01 {

    public static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {

    }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
