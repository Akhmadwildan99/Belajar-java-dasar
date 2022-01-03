package ClassOOP.polymorphism;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.animalSound();
        cat.animalSound();
        dog.animalSound();
    }
}
