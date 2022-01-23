package Belajar.java.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        // MEmbuat immutable set birisi kososng atau empty
        Set<String> empty = Collections.emptySet();

        // Membuat immutable set berisi satu elemet
        Set<String> one = Collections.singleton("akhmad");

        //Immutable set bersi banyak element
        Set<String> names = new HashSet<>();
        names.add("akhmad");
        names.add("wildan");

        Set<String> immutable = Collections.unmodifiableSet(names);

        Set<String> foods = Set.of("pizza", "fried chicken", "big mac");

    }
}
