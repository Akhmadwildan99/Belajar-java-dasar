package Belajar.java.collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void addHobbies(String hobby) {
        hobbies.add(hobby);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
