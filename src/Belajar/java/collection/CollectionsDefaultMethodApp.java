package Belajar.java.collection;

import java.util.*;
import java.util.function.*;

public class CollectionsDefaultMethodApp {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            integers.add(i);
        }

        integers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 4;
            }
        });

        integers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 100;
            }
        });

        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        Map<String, String> names = new HashMap<>();
        names.put("Akhmad", "Akhmad value itlah");
        names.put("Wildan", "Wildan value itulah");
        names.put("Danu", "Danu value itulah");

        names.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        names.replaceAll(new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                // s = kata pertama
                // s2 = seluruh kata
                return s + " " +s2 + " "+ "sudah di replace";
            }
        });

        names.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });



    }
}
