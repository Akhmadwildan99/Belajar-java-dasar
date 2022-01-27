package Belajar.java.collection;

public class SingleQueueApp {
    public static void main(String[] args) {
        SingleQueue<String> name = new SingleQueue<>();
        System.out.println(name.offer("Akhmad"));
        System.out.println(name.offer("Wildan"));

        System.out.println(name.size());
        System.out.println(name.poll());
        System.out.println(name.size());
        System.out.println(name.peek());
    }
}
