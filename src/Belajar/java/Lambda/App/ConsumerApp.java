package Belajar.java.Lambda.App;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> consumer = (val) -> System.out.println(val.substring(3, 7));
        consumer.accept("aku adalah aku");
    }
}
