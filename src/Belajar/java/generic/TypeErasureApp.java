package Belajar.java.generic;

import Util.MyData;

public class TypeErasureApp {
    /**
     *Type erasure adalah saat kita menghilangkan
     * informasi type generic pada object
     */
    public static void main(String[] args) {
        // Type erasure /Tidak aman ketika dijalankan
        MyData myData = new MyData("Wildan");
        MyData<Integer> integer = (MyData<Integer>) myData;
        Integer integer1 = integer.getData(); //Error saat dijalankan

        //Non type erasure / Lebih aman dijalankan

        MyData<String> data = new MyData<>("data benar");
        System.out.println(data.getData());

    }
}
