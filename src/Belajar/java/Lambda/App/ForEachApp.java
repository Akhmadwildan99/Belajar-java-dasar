package Belajar.java.Lambda.App;

import java.util.List;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Akhmad", "Wildan", "Danu");
        list.forEach(value -> System.out.println(value));
        list.forEach(System.out::println);


    }
}
