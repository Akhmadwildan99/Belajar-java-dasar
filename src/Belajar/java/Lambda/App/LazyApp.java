package Belajar.java.Lambda.App;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(100, () -> getName("akhmad"));
    }

    public static void testScore(int score, Supplier<String> supplier){
        if (score >= 80){
            System.out.println("Selamat " + supplier.get() + ", anda Lulus");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName(String name){
        System.out.println("akses getName method");
        return name;
    }
}
