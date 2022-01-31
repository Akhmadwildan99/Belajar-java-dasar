package Belajar.java.Lambda.App;

import java.util.function.BiPredicate;

public class BiPredicateApp {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (key, val) -> key.equals(val.length());

        System.out.println(biPredicate.test(1, "a"));
        boolean biPredicate1 = biPredicate.test(3, "avfg");
        System.out.println(biPredicate1);
    }
}
