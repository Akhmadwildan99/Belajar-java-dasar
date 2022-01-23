package Belajar.java.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");

        for (var val : queue){
            System.out.println(val);
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            queue.offer(String.valueOf(i));
        }

        for (String next = queue.poll(); next != null; next = queue.poll()){
            // poll() mengambil antrian pertama dan mengahapus
            System.out.println(next);
        }

        System.out.println("");
        for (var val : queue){
            System.out.println(val);
        }

        System.out.println("");
        System.out.println("Explein element & peek");

        Queue<String> stringQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            stringQueue.offer(String.valueOf(i));
        }
        for (var el : stringQueue){
            System.out.println(el);
        }
        String element = stringQueue.element();

    }
}
