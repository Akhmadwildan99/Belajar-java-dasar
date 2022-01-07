package ClassOOP.AnynomousClass;

public class HelloApp {

    public static void main(String[] args) {
        HelloWorld indonesia = new HelloWorld() {

            public void sayHello() {
                System.out.println("Halo");
            }


            public void sayHello(String name) {
                System.out.println("Halo" + name);
            }
        };

        indonesia.sayHello();
        indonesia.sayHello(" wildan");
    }
}
