package com.avg.demo.day1;

import java.util.*;

public class SetDemo {
    // HashSet is a collection that contains no duplicate elements
    // LinkedHashSet is a hash table and linked list implementation of the Set interface
    // TreeSet is a NavigableSet that uses a red-black tree internally
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("value1");
        hashSet.add("value1");
        hashSet.add("value1");
        hashSet.add("value2");

        hashSet.forEach(System.out::println);
        System.out.println("---");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("value3");
        linkedHashSet.add("value2");
        linkedHashSet.add("value7");
        linkedHashSet.forEach(System.out::println);
        System.out.println("---");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("value3");
        treeSet.add("value7");
        treeSet.add("value5");
        treeSet.forEach(System.out::println);
        System.out.println("---");

        HashSet<MyCustom> myCustomHashSet = new HashSet<>();
        myCustomHashSet.add(new MyCustom(1, "name"));
        myCustomHashSet.add(new MyCustom(1, "na2me"));
        myCustomHashSet.add(new MyCustom(2, "name"));
        myCustomHashSet.forEach(System.out::println);
        System.out.println("---");

        Comparator<MyCustom> myCustomComparator = (myCustom, t1) -> t1.id - myCustom.id;
        TreeSet<MyCustom> customTreeSet = new TreeSet<>(myCustomComparator);
        customTreeSet.add(new MyCustom(3, "name"));
        customTreeSet.add(new MyCustom(10, "na2me"));
        customTreeSet.add(new MyCustom(7, "name"));
        customTreeSet.forEach(System.out::println);
        System.out.println("---");

        List<Integer> duplicates = List.of(100, 111,111,100,105);
        HashSet<Integer> removeDuplicates = new HashSet<>(duplicates);
        removeDuplicates.forEach(System.out::println);
    }

    static class MyCustom {
        int id;
        String name;

        public MyCustom(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            MyCustom myCustom = (MyCustom) o;
            return id == myCustom.id && Objects.equals(name, myCustom.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "MyCustom{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
