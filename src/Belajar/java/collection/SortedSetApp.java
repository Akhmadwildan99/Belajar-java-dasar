package Belajar.java.collection;

import Belajar.java.collection.data.Person;
import Belajar.java.collection.data.PersonComparator;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
        people.add(new Person("Eko"));
        people.add(new Person("wildan"));

        SortedSet<Person> immutable = Collections.unmodifiableSortedSet(people);
//        immutable.add(new Person("Elang")); //ERROR
        for (var name : people){
            System.out.println(name.getName());
        }


    }
}
