package Class.Class.Standard.Java;

import java.util.Random;

public class RandomApp {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int number = random.nextInt(1000);
            System.out.println(number);

        }
    }
}
