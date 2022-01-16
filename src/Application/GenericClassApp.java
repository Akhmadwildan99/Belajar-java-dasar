package Application;

import Belajar.java.generic.GenericAppClass;

public class GenericClassApp {
    public static void main(String[] args) {
        System.out.println("String...");
        GenericAppClass<String> data = new GenericAppClass<String>();
        data.setData("Wildan");
        System.out.println(data.getData());

        System.out.println(" ");

        System.out.println("Integer");
        GenericAppClass<Integer> dataInt = new GenericAppClass(567);
        System.out.println(dataInt.getData());

    }
}
