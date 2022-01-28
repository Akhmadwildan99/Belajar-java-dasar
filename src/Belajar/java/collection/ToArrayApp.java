package Belajar.java.collection;

import java.util.Arrays;
import java.util.List;

public class ToArrayApp {
    public static void main(String[] args) {
        List<String> numb = List.of("satu", "dua", "tiga");
        Object[] numbArray = numb.toArray();
        String[] arrayString = numb.toArray(new String[]{});

        System.out.println(Arrays.toString(numbArray));
        System.out.println(Arrays.toString(arrayString));
    }
}
