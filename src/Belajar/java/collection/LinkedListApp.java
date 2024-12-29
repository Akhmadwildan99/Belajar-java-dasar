package Belajar.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ari");
        linkedList.add("Budi");
        linkedList.add("Santoso");

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
