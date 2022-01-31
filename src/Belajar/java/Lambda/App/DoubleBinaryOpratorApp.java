package Belajar.java.Lambda.App;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOpratorApp {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (first, second) -> {
            return first * second;
        };

        System.out.println(doubleBinaryOperator.applyAsDouble(45.44, 56.45));
    }
}
