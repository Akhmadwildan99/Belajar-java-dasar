package Belajar.java.Lambda.App;

import java.util.function.BinaryOperator;

public class BinaryOpratorApp {
    public static void main(String[] args) {
        BinaryOperator<Integer> max = BinaryOpratorApp::apply;

        System.out.println(max.apply(3, 4));
        System.out.println(max.apply(2,1));
    }

    private static Integer apply(Integer element1, Integer element2) {
        return element1 > element2 ? element1 : element2;
    }
}
