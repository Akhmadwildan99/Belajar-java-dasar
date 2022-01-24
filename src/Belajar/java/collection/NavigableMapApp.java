package Belajar.java.collection;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        NavigableMap<String, String> navigableMap = new TreeMap<>(comparator);  //Descending
        navigableMap.put("first", "AKhamd");
        navigableMap.put("last", "Wildan");
        System.out.println(navigableMap.floorEntry("first"));
        System.out.println(navigableMap.lastEntry());
        System.out.println(navigableMap.pollLastEntry()); //MEngambil terakhir masuk dan menghapus
        navigableMap.put("first", "AKhamd");
        navigableMap.put("second", "Danu");
        NavigableMap<String, String> subMapNavigableMap = navigableMap.subMap("second", true, "last", true);
        for (var elem : subMapNavigableMap.keySet()){
            System.out.println(elem);
        }
        for (var key : navigableMap.keySet()){
            System.out.println(navigableMap.keySet());
            System.out.println(navigableMap.get(key));
        }
    }
}
