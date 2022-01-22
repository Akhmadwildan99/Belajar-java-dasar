package Belajar.java.collection;


import java.util.*;

public class CollectionApp {

    public static void main(String[] args) {
        Collection<String> stringCollection = List.of("Akhmad", "wildan", "Nanu");
        Iterator<String> stringIterator = stringCollection.iterator();

        while(stringIterator.hasNext()){
            String name = stringIterator.next();
            System.out.println(name);
        }


        List<Integer> nomor = new ArrayList<>();
        nomor.addAll(List.of(0, 4, 5, 6, 7, 8, 3));
        nomor.add(5);
        int size = nomor.size();
        System.out.println(size);
        System.out.println("menambah");
        for (var num : nomor){
            System.out.println(num);
        }


        System.out.println("menghapus index ke 6");
        nomor.remove(6);
        for (var num : nomor){
            System.out.println(num);
        }

        System.out.println("menghapus semua object yang dimasukkan");
        nomor.removeAll(Arrays.asList(3, 4, 5));
        for (var num : nomor){

            System.out.println(num);
        }

        nomor.add(5);
        nomor.add(4);
        nomor.add(10);

        System.out.println(nomor.contains(4));
        System.out.println(nomor.containsAll(Arrays.asList(4, 6, 8, 68)));//Harus benar semua agar return value true
    }
}
