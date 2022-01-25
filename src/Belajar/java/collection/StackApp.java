package Belajar.java.collection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        //LEbih lambat karena di setiap methodnya terdapat syntax
        //Shyncronized tapi lebih aman ketika digunakan secara paralel
        Stack<String> stack = new Stack<>();
        //Stack class ini LIFO (Last In First Out)
        //KEtika ketika memakai push maka akan menbahkan di akhir
        //KEtika kita memakai pop maka yang terambil dan terhapus tumpukan paling atas terlebih dulu / yang terakhir masuk
        stack.push("satu");
        stack.push("dua");
        stack.push("tiga");
//        System.out.println(stack.size());
//        System.out.println(stack.peek());

        for (int i = 1; i <= 3; i++) {
            //System.out.println(stack.peek()); // Memprint tumpukan paling atas sebanyak perulangan;
            System.out.println(stack.pop()); // Mngambil data lalu menghapus.
        }

        stack.push("satu");
        stack.push("dua");
        stack.push("tiga");

        for (String val = stack.pop(); val != null; val = stack.pop()){
            System.out.println(val);
        }
    }
}
