package Belajar.java.generic;

import Util.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Budi", "Indonesia"),
                new Person("Agus", "Indonesia"),
                new Person("Aan", "Portugal")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("sebelum di sort");
        System.out.println(Arrays.toString(peoples));
        Arrays.sort(peoples, comparator);
        System.out.println("Setelah di sort");
        System.out.println(Arrays.toString(peoples));

        for (var people : peoples){
            System.out.println(people.getName());
        }
    }
}
