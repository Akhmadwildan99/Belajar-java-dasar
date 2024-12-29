package Method;

public class MethodOverloading {
    static void sayHello(String name) {
        System.out.println("Hi my name is " + name + "." );
    }

    static void sayHello(String name, int age){
        System.out.println("Hi nama saya " + name + ", umur saya " + age + " tahun.");
    }

    private String greeting;

    public void setGreeting(String firstName){
        this.greeting = firstName;
    }

    public void setName(String firstName, String lastName){
        this.greeting = firstName + " "+ lastName;
    }

    public String getGreeting() {
        return this.greeting;
    }

    public static void main(String[] args) {
        sayHello("Wildan");

        sayHello("Lando", 22);

        MethodOverloading overloading = new MethodOverloading();
        overloading.setGreeting("Mulyono");


        System.out.println(overloading.greeting);

        overloading.setName("Mulyono", "Nitinegoro");

        System.out.println(overloading.greeting);
    }
}
