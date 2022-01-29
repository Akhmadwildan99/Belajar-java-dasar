package Belajar.java.Lambda.App;

import java.util.function.BiFunction;

public class BiFunctionApp {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> nameLength = (firstName, secondName) -> {
            Integer totalFirst = firstName.length();
            Integer totalSecond = firstName.length();
            return totalFirst + totalSecond;
        };

        System.out.println(nameLength.apply("Akhmad ", "Wildan   "));
    }
}
