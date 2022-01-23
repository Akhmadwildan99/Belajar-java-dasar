package Belajar.java.collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp  {
    public  static  enum Food {
        Eat, Drink, Pizza
    }

    public static void main(String[] args) {
        EnumSet<Food> enumSet = EnumSet.of(Food.Eat, Food.Drink, Food.Pizza);
        for (var enumValue : enumSet){
            System.out.println(enumValue);
        }

        Set<Food> foodSet = EnumSet.allOf(Food.class);
        for (var food : foodSet){
            System.out.println(food);
        }
    }
}
