package Application;

import Belajar.java.generic.MethodGeneric;
import Belajar.java.generic.MultipleTypeGeneric;

public class MultipleApp {

    public static void main(String[] args) {
        MultipleTypeGeneric<String, Integer> data = new MultipleTypeGeneric("Wildan", 22);
        System.out.println("my name is " + data.getFirst() + ", " + data.getSecond() + " is my age");

        String[] arr = {"Akhmad", "wildan", "Nanu"};
        Integer[] num = {1, 4, 2 ,3, 5};
        MethodGeneric.ArrMethod(arr);
        MethodGeneric.ArrMethod(num);
    }
}
