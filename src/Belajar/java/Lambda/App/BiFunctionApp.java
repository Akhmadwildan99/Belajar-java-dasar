package Belajar.java.Lambda.App;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionApp {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> nameLength = (firstName, secondName) -> {
            Integer totalFirst = firstName.length();
            Integer totalSecond = firstName.length();
            return totalFirst + totalSecond;
        };

        System.out.println(nameLength.apply("Akhmad ", "Wildan   "));

        Function<String, String> function = String::toUpperCase;
        String jojo = function.apply("jojo");
        System.out.println(jojo);

        Function<String, Integer> function1 = Integer::valueOf;
        Integer apply = function1.apply("56");
        System.out.println(apply);

    }
}
