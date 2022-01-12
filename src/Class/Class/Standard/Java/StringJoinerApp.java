package Class.Class.Standard.Java;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        String[] names = {"Akhmad", "Wildan"};

        StringJoiner joiner = new StringJoiner(
                " || ", "[", "]"
        );

        for (var join : names){
            joiner.add(join);
        }

        String valJoin = joiner.toString();
        System.out.println(valJoin);
    }
}
