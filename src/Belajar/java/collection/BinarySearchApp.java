package Belajar.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearchApp{
    public static void main(String[] args) {

//

        Comparator<Integer> reverse = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        ArrayList<Integer> list = new ArrayList<>();

        for (var i = 0; i < 100; i++){
            list.add(i);
        }
        int index = Collections.binarySearch(list, 99);
        System.out.println(index);

        Collections.sort(list, reverse);

        int index2 = Collections.binarySearch(list, 20, reverse); // HARUS DI REVERSE DULU
        System.out.println(index2);

//        System.out.println(Collections.binarySearch(list, 1, reverse));
    }
}
//public class BinarySearchApp {
//    public static  ArrayList<Integer> id = new ArrayList<>();
//
//    public static void main(String[] args) {
//        for (var i = 0; i < 10000; i++){
//            id.add(generateId(id));
//        }
//
//        for (var val : id){
//            System.out.println(val);
//        }
//    }
//
//    public static Integer generateId(ArrayList<Integer> id){
//        Integer sementara = null;
//        for (var i = 1000; i <= 1000; i++) {
//            if (!id.contains(i)){
//                sementara = i;
//                break;
//            }
//        }
//        return sementara;
//    }
//
//}
