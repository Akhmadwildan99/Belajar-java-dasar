package Belajar.java.Lambda.App;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.putAll(Map.of("first_name", "Akhmad","middle_name", "Wildan" ,"last_name", "Danu"));
        map.forEach((key, val) -> System.out.println(key + " : " + val));

        map.replaceAll((key, val) -> val.toUpperCase() +" is "+ key.toUpperCase());

        map.forEach((key, val) -> System.out.println(key + " : " + val));

    }
}
