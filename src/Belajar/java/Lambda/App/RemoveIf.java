package Belajar.java.Lambda.App;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Akhmad");
        list.add("Wildan");
        list.add("Danu");

        list.removeIf(value -> value.length() <= 4);

        list.forEach(System.out::println);
        list.replaceAll(s -> s = "trying");
        list.forEach(System.out::println);
    }
}
