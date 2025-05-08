package com.avg.demo.day1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    // Queue is a collection that holds elements prior to processing
    // Deque is a double-ended queue that allows elements to be added or removed from both ends
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("task3");
        tasks.offer("task7");
        tasks.offer("task5");
        tasks.forEach(System.out::println);
        System.out.println("---");

        System.out.println("poll: " + tasks.poll());
        System.out.println("---");

        tasks.forEach(System.out::println);
        System.out.println("---");
        System.out.println("peek: " + tasks.peek());
        tasks.add("taskAdded");
        System.out.println("---");
        tasks.forEach(System.out::println);

        System.out.println("---//---");
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println("poll: " + pq.poll()); //30

        System.out.println("---//---");
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(10);
        arrayDeque.add(30);
        arrayDeque.add(20);
        System.out.println(arrayDeque.poll());

        System.out.println("---//---");
        TaskScheduler ts = new TaskScheduler();
        ts.addTask(new Task(1, "task1"));
        ts.addTask(new Task(2, "task2"));
        ts.addTask(new Task(3, "task3"));
        ts.processTask();
    }

    static class Task {
        int id;
        String name;

        public Task(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    static class TaskScheduler {
        Queue<Task> tasks;

        public TaskScheduler() {
            this.tasks = new LinkedList<>();
            ;
        }

        public void addTask(Task task) {
            this.tasks.add(task);
        }

        public void processTask() {
            while (!tasks.isEmpty()) {
                Task task = tasks.poll();
                System.out.println("processing " + task.name);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("complete " + task.name);
            }
            System.out.println("finish scheduler");
        }
    }

}
