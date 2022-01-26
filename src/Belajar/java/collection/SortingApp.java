package Belajar.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        //Sorting ini hanya untuk list interface, karena map, set sudah punya fitur sorting sendiri
        // Syarat melakukan sorting list harus mutable
        List<String> names = new ArrayList<>();
        names.add("Budi");
        names.add("Ali");
        names.add("Nino");

        Collections.sort(names);


        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(names, reverse);

        for (var elem : names){
            System.out.println(elem);
        }
    }
}
