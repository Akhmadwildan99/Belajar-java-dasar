package Belajar.java.Lambda.App;

import Belajar.java.Lambda.Function.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String simpleAction(String value) {
                return value;
            }
        };

        SimpleAction simpleAction2 = (value) -> value;

        System.out.println(simpleAction1.simpleAction("ke 1"));
        System.out.println(simpleAction2.simpleAction("ke 2"));
    }
}
