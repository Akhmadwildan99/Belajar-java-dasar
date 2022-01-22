package Belajar.java.collection;

import Belajar.java.collection.data.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu"); //immutable list single
        List<String> empty = Collections.emptyList(); // immutable list empty
        List<String> mutable = new ArrayList<>(); //bisa diubah
        mutable.add("akhmad");
        mutable.add("wildan");

        List<String> immutable = Collections.unmodifiableList(mutable); //Tidak bisa diubah
        List<String> elements = List.of("oke", "oce"); // Tidak bisa diubah
    }
}
