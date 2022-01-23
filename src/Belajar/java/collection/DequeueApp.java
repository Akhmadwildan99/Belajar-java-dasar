package Belajar.java.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueApp {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.offerLast("akhmad");
        stack.offerLast("Wildan");
        stack.offerLast("nanu");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();

        queue.offerLast("akhmad");
        queue.offerLast("wildan");
        queue.offerLast("nanu");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
