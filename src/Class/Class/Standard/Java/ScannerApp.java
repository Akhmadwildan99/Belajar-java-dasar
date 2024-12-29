package Class.Class.Standard.Java;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        final Float maxTemperature = 102.5f;
        System.out.println("Enter the subtance's Celcius temperature: ");
        Scanner sc = new Scanner(System.in);
        Float inputTemperature = Float.valueOf(sc.nextLine());

        while (inputTemperature.compareTo(maxTemperature) > 0) {
            System.out.println("The temperature is too high. Turn the  Thermostat down and wait 5 minutes\n");
            System.out.println("Then, take the celcius temperature again and enter it here: ");
            Scanner scAgain = new Scanner(System.in);
            inputTemperature =Float.valueOf(scAgain.nextLine());
        }

        System.out.println("The temperature is acceptable. Check it again in 15 minutes.");
    }
}
