package Belajar.java.collection;

import java.util.EnumMap;

public class EnumMapApp {
    public static enum  Level {
        FREE, VIP;
    }

    public static void main(String[] args) {
        EnumMap<Level, String> enumMap = new EnumMap<>(Level.class);
        enumMap.put(Level.FREE, "Gratis");
        enumMap.put(Level.VIP, "bayar");

        for (var val : enumMap.values()){
            System.out.println(val);
        }
    }
}
