package Method;

public class MethodOverloading {
    static void sayHello(String name) {
        System.out.println("Hi my name is " + name + "." );
    }

    static void sayHello(String name, int age){
        System.out.println("Hi nama saya " + name + ", umur saya " + age + " tahun.");
    }

    public static void main(String[] args) {
        sayHello("Wildan");

        sayHello("Lando", 22);
    }
}
