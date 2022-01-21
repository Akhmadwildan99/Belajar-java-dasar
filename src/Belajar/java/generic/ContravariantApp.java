package Belajar.java.generic;

import Util.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> data = new MyData<>("wildan");
        MyData<String> data1 = new MyData<>("riko");
        System.out.println(data1.getData());
        String dataString = (String) data.getData();
        System.out.println(dataString);
        process(data);
    }

    public static void process(MyData<? super Integer> myData){
        myData.setData(690);
        Object data = myData.getData();
        System.out.println(data);
    }
}
