package Belajar.java.generic;

import Util.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> data = new MyData<>("wildan");
        String dataString = (String) data.getData();
        System.out.println(dataString);
        process(data);
    }

    public static void process(MyData<? super Integer> myData){
        myData.setData(455555);
        Object data = myData.getData();
        System.out.println(data);
    }
}
