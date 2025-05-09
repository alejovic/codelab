package com.avg.demo.patterns.creational.singleton;

// version 4 with holder with initialization
public class Singleton04 {

    private Singleton04() {
    }

    private static class Holder {
        public static final Singleton04 INSTANCE = new Singleton04();
    }

    public static Singleton04 getInstance() {
        return Holder.INSTANCE;
    }
}
