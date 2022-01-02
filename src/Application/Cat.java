package Application;

import ClassOOP.modifier.Animal;

public class Cat extends Animal {
    public Cat(String name, int legs) {
       this.nama =  name;
       this.kaki = legs;
    }
    public void habitat() {
        System.out.println(nama + " berkaki " + kaki + " hidup di darat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Pussy", 4);
        System.out.println(cat.nama);
        System.out.println(cat.kaki);
        cat.habitat();


    }
}
