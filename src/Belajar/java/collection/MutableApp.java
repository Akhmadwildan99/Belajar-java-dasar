package Belajar.java.collection;

import Belajar.java.collection.data.Person;

import java.time.Period;
import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Wildan");
        person.addHobbies("gaming");
        person.addHobbies("Fishing");
        person.addHobbies("drink some coffee");

        doSomethingWithHobbies(person.getHobbies()); //Data bisa diubah / tidak aman karena tidak diprotect di field getHobbies
        for (var hobby : person.getHobbies()){ //Jika di protect maka method doSomethingWithHobbies akan error
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> list){ //ERROR
        list.add("stole");
    }
}
