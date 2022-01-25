package Belajar.java.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        //LEbih lambat karena di setiap methodnya terdapat syntax
        //Shyncronized tapi lebih aman ketika digunakan secara paralel
        list.add("satu");
        list.add("dua");

        for (var elem : list){
            System.out.println(elem);
        }
    }
}
