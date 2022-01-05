package ClassOOP.Interface;

interface Animal {
    void animalSound();
    void animalSleep();
    default void animalEat(){
        System.out.println("carnivore eat meat, herbivora eat the grass, omnivora eat each food wich good.");
    }
}
