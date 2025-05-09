package com.avg.demo.day2;

import java.util.TreeMap;

public class MapDemo3 {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
//        treeMap.put(null, "value0");// Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
        treeMap.put(1, "value1");
        treeMap.put(2, "value2");
        treeMap.put(3, "value3");

        System.out.println("higherEntry(2)' " + treeMap.higherEntry(2));//3
        System.out.println("lowerEntry(2) " + treeMap.lowerEntry(2));//1

        System.out.println("firstEntry " + treeMap.firstEntry());//1
        System.out.println("lastEntry " + treeMap.lastEntry());//3

    }
}
