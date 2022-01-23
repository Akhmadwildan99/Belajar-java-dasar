package Belajar.java.collection;

import java.util.*;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("akhmad", "wildan", "nanu", "dan", "wild"));

        NavigableSet<String> namesDescending = names.descendingSet();

        NavigableSet<String> wildan = names.headSet("wildan", true);

        String floorNav = names.floor("akhmad");
        System.out.println(floorNav);

        String poll = names.pollLast();
        System.out.println(poll);
        System.out.println("");
        for (var name : wildan){
            System.out.println(name);
        }
    }
}
