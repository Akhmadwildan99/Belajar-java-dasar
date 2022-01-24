package Belajar.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class HashMapApp {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("first", "wildan");
        map.put("second", "akhmad");

        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }

        for (var entry : map.entrySet()){
            System.out.println(entry);
        }

    }
}
