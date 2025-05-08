package com.avg.demo.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class MapDemo {
    // HashMap is a hash table based implementation of the Map interface
    // LinkedHashMap is a hash table and linked list implementation of the Map interface
    // TreeMap is a NavigableMap that uses a red-black tree internally
    // HashTable is a synchronized version of HashMap
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(null, "null");
        hashMap.put(null, "null");
        hashMap.put(3, "value1");
        hashMap.put(1, "duplicate");
        hashMap.put(1, "value2");
        hashMap.put(2, "value3");

        hashMap.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
        System.out.println("---//---");
        System.out.println("getOrDefault(1): "+ hashMap.getOrDefault(5,"value5"));
        System.out.println("---//---");

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null, "null");
        linkedHashMap.put(null, "null");
        linkedHashMap.put(3, "value1");
        linkedHashMap.put(3, "duplicate");
        linkedHashMap.put(1, "value2");
        linkedHashMap.put(2, "value3");
        linkedHashMap.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
        System.out.println("---//---");
        Function<Integer, String> transform = x -> {
            //linkedHashMap.put(x, "value"+x);//java.util.ConcurrentModificationException
            return x + " can be added.";
        };
        String computeIfAbsent = linkedHashMap.computeIfAbsent(4, transform);
        System.out.println("computeIfAbsent: "+ computeIfAbsent);
    }
}
