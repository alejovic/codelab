package com.avg.demo.day2;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo2 {

    public static void main(String[] args) {
        // Count word frequency in a sentence:
        String text = "This is a text and it can have some repeated words. It is just a test with some words";
        String[] words = text.split("\\W+");
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        wordCount.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));

        // Group names by their starting character:
        Map<Character, List<String>> grouped = new HashMap<>();
        for (String name : words) {
            char key = name.charAt(0);
            grouped.computeIfAbsent(key, k -> new ArrayList<>()).add(name);
        }
        grouped.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));


        // Caching Results (e.g., Memoization)
        System.out.println("factorial(5)" + factorial(5));
        System.out.println("factorial(2)" + factorial(2));
        System.out.println("factorial(5)" + factorial(5));


    }

    static Map<Integer, Long> factorialCache = new ConcurrentHashMap<>();
//    static Map<Integer, Long> factorialCache = Collections.synchronizedMap(new HashMap<>());
    static long factorial(int n) {
        return factorialCache.computeIfAbsent(n , k -> {
            if (k <= 1) return 1L;
            return k * (factorial(k - 1));
        });
    }
}
