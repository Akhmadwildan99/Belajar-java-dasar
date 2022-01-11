package Class.Class.Standard.Java;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringApp {

    public static void main(String[] args) {
        String name = "akhmad Wildan";
        String name2 = "akhmad Wildan";
        int nameLength = name.length();
        System.out.println(nameLength);
        System.out.println(name.isEmpty());
        System.out.println(name.charAt(7));
        System.out.println(name.codePointAt(6));
        System.out.println(name.codePointBefore(6));
        System.out.println(name.getBytes());
        System.out.println(name.equals(name2));
        System.out.println(name.endsWith("y"));
        System.out.println(name.indexOf(" "));
        System.out.println(name.indexOf("a",4));
        System.out.println(name.lastIndexOf("i"));

        String drakor = "SquidGame";
        System.out.println(drakor.substring(3));
        System.out.println(drakor.substring(1, 6));
        System.out.println(drakor.concat(name));

        String band = "coldplay";
        System.out.println(band.replaceFirst("l", "m"));
        System.out.println(band.replaceFirst("co", "ka"));
        System.out.println(band.replaceAll("co", "ks"));
        System.out.println(band.replace("oldplay", "art"));
        String val = "aaaa";
        System.out.println(val.replace("aa", "c"));

        System.out.println("Ini split dengan satu parameter");
        String driver = "Lando Noris Daniel Ricciardo";

        String[] driverSpl = driver.split(" ");
        for (var valDriver : driverSpl){
            System.out.println(valDriver);
        }

        String FerrariDriver = "Carlo Sainz : Chaeles Lerclerc";

        String[] FerrariSpl = FerrariDriver.split(": ");

        for (var DriverFerrari: FerrariSpl) {
            System.out.println(DriverFerrari);
        }

        System.out.println("Ini split dengan dua parameter");

        String employee = "Wildan, Akhmad, Ilham, Ali, Rizal, Adi";
        String[] employeeSpl = employee.split(", ", 7);

        for (var valKar : employeeSpl){
            System.out.println(valKar);
        }

        System.out.println("Join method ...");

        String f1Team = String.join(" - ", "McLaren", "Ferrari", "MercedesAmg", "Alpin", "Red Bull");
        System.out.println(f1Team);

        System.out.println("To lower Case");
        String me = "Akhmad Wildan";
        System.out.println(me.toLowerCase());
        System.out.println("To Upper Case");
        System.out.println(me.toUpperCase());

        System.out.println("Trim");
        System.out.println(me.trim());

        System.out.println("Value of");

        Integer size = 7;
        System.out.println(String.valueOf(size));

    }
}
