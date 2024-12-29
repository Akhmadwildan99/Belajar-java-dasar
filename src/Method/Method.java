package Method;

public class Method {
    static void sayHello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHello();
        sayHello();

        MethodOverloading overloading = new MethodOverloading();
        overloading.setGreeting("Hello");


        System.out.println(overloading.getGreeting());
        //Output: Hello

        overloading.setName("Hello", "World");

        System.out.println(overloading.getGreeting());
        //Output: Hello World
    }
}
