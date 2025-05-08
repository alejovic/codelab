package com.avg.demo.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {
    // ArrayList is a resizable array implementation of the List interface
    // LinkedList is a doubly linked list implementation of the List interface
        public static void main(String[] args) {
            List<String> arrayList = new ArrayList<>();
            arrayList.add("value1");
            arrayList.add("value2");
            arrayList.add("value1");
            arrayList.add("value1");
            arrayList.add("value1");
            arrayList.add("value1");
            arrayList.add("value4");
            arrayList.forEach(System.out::println);
            System.out.println("---");

            String value2 = arrayList.get(2);
            System.out.println("value2: " + value2);
            System.out.println("---");

            boolean removed = arrayList.remove("value1");
            System.out.println("value3 removed: " + removed);
            System.out.println("---");

            arrayList.forEach(System.out::println);
            System.out.println("---");

            String str = arrayList.stream().collect(Collectors.joining(";"));
            System.out.println(str);
            System.out.println("---");


            Predicate<String> predicate = x -> x.length() < 20;

            List<String> newList = arrayList.stream().filter(predicate).toList();
            newList.forEach(System.out::println);
            System.out.println("---");

            Consumer<String> consumer = x -> System.out.println("consumed: "+x);
            arrayList.stream().forEach(consumer);
            System.out.println("---");

            List<List<String>> lstString = List.of(
                    arrayList,
                    Arrays.asList("string-2","string-3-")
            );

            Function<List<String>, Stream<String>> function = Collection::stream;
            List<Object> flatmap = lstString.stream().flatMap(function).collect(Collectors.toUnmodifiableList());
            flatmap.forEach(System.out::println);
            System.out.println("---");

            Function<String, String> function1 = x -> {
                char[] chars = x.toCharArray();
                Arrays.sort(chars);
                return new String(chars);
            };
            arrayList.stream().collect(Collectors.groupingBy(
                    function1
            )).values().forEach(System.out::println);

        }
}
