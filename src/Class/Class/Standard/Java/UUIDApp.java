package Class.Class.Standard.Java;

import java.util.UUID;

public class UUIDApp {

    public static void main(String[] args) {

        for (var i = 0; i < 30; i++){
            UUID uuid = UUID.randomUUID();
            String keys = uuid.toString();

            System.out.println(keys);
        }

        UUID idName = UUID.fromString("9ab637c8-aec8-4270-95a1-b0cfdd707a8b");

        String name = idName.toString();
        System.out.println(idName);
        System.out.println(name);
    }
}
