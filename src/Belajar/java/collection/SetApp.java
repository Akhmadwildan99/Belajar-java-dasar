package Belajar.java.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SetApp {
    public static void main(String[] args) {
        // set interface hashset : menerima data unik dan tidak urut dalam penyimpannya

        HashSet<String> names = new HashSet<>();
        names.add("akhmad");
        names.add("wildan");
        names.add("nanu");
        names.addAll(Arrays.asList("suminto", "susilo"));
        names.addAll(List.of("roki", "riko"));

        for (var name : names){
            System.out.println(name);
        }


        //LinkedHashSet menerima data unik namun menyimpannya dalam urutan yang sesuai
        //dengan saat kita memasukkan data.

        LinkedHashSet<String> foods = new LinkedHashSet<>();
        foods.add("dongkal");
        foods.add("siomay");
        foods.add("cilok");

        for (var food : foods){
            System.out.println(food);
        }
    }
}
