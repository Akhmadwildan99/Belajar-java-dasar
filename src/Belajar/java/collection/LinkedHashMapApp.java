package Belajar.java.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("first", "akhmad");
        linkedHashMap.put("second", "Wildan");

        for (var val : linkedHashMap.values()){
            System.out.println(val);
        }
    }
}
