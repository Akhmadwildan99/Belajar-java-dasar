package Class.Class.Standard.Java;

import java.util.Base64;

public class Base64App {

    public static void main(String[] args) {

        String original = "Akhmad widan";

        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        byte[] decode = Base64.getDecoder().decode(encoded);

        String result = new String(decode);

        System.out.println(decode);
        System.out.println(result);
    }
}
