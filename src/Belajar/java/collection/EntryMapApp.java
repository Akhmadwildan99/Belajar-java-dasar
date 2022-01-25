package Belajar.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Akhmad", "Akhmad value");
        map.put("Wildan", "Wildan value");
        map.put("Danu", "Danu value");
        map.put("Danu", "Nanu value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
