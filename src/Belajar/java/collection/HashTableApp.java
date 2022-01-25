package Belajar.java.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        //LEbih lambat karena di setiap methodnya terdapat syntax
        //Shyncronized tapi lebih aman ketika digunakan secara paralel
        map.put("satu", "satu");
        map.put("dua", "dua");
        map.put("tiga", "tiga");

        for (var key : map.keySet()){
            System.out.println(key);
        }
    }
}
