package Belajar.java.generic;

import Util.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Budi", "Indonesia"),
                new Person("Agus", "Indonesia"),
                new Person("Aan", "Portugal")
        };

        Arrays.sort(peoples);
        System.out.println(Arrays.toString(peoples));

        for (var people: peoples) {
            System.out.println(people.getName());
        }
    }
}
