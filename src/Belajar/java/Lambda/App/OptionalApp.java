package Belajar.java.Lambda.App;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Akay");
        sayHello(null);
    }

    public static void sayHello(String name){
//        Optional<String> optional = Optional.ofNullable(name);
//        optional.ifPresent(val -> System.out.println("HALL0 " + val.toUpperCase()));

//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(val -> System.out.println("HALLO " + val),
//                        () -> System.out.println("HALLO"));
        String name1 = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("Teman");

        System.out.println("Hallo "+ name1);
    }
}
