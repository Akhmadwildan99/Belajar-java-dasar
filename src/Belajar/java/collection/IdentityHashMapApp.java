package Belajar.java.collection;

import java.util.IdentityHashMap;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put("first", "wildan");
        String key1 = "first";
        identityHashMap.put(key1, "akhmad");
        String key2 = "first";
        identityHashMap.put(key2, "wildanagain");
        for (var val : identityHashMap.values()){
            System.out.println(val);
        }
    }
}
