package Belajar.java.Lambda.App;

import java.util.function.BiConsumer;

public class BiConsumerApp {
    public static void main(String[] args) {
        BiConsumer<String, String> names = (name1, name2) -> System.out.println(name1 + " " + name2);
        names.accept("Akhmad", "Wildan");
    }
}
