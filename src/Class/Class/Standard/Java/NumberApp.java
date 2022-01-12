package Class.Class.Standard.Java;

import com.sun.jdi.LongValue;

public class NumberApp {
    public static void main(String[] args) {
        int num = 34589;
        byte num2 = (byte) num;

        double num3 = (double) num;
        System.out.println(num3);
        System.out.println(num);
        System.out.println(num2);


        String age =  "45";

        Integer ageInt = Integer.valueOf(age);
        System.out.println(ageInt.doubleValue());



    }
}
