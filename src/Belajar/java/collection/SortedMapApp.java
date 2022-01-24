package Belajar.java.collection;

import java.util.*;

public class SortedMapApp {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Descending
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(comparator);
        sortedMap.put("joko", "JOKO");
        sortedMap.put("budi", "BUDI");
        sortedMap.put("el", "EL");
        for (var key :sortedMap.keySet()){
            System.out.println(sortedMap.get(key));
        }

        //Immutable sorted map
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
        //immutable.put("error", "ups"); //ERROR
    }
}
