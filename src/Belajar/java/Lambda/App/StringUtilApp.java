package Belajar.java.Lambda.App;

import Belajar.java.Lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtilApp {
    public static void main(String[] args) {
        Predicate<String> predicate = StringUtil::isLowerCase;
        System.out.println(predicate.test("ROKMAN"));
        System.out.println(predicate.test("eko"));
        System.out.println(predicate.test("Danu"));

        StringUtilApp stringUtilApp = new StringUtilApp();
        stringUtilApp.run();

        Function<String, String> function = value -> value.toUpperCase();
        //Function<String, String> function = String::toUpperCase;
        System.out.println(function.apply("noted"));
        System.out.println(function.apply("iska"));

    }

    public void run(){
        Predicate<String> predicate = this::isLowerCase;
        System.out.println(predicate.test("ROKMAN"));
        System.out.println(predicate.test("eko"));
        System.out.println(predicate.test("Danu"));
    }

    public boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
