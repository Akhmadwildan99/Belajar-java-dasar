package Belajar.java.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singelaton = Collections.singletonMap("first", "wildan");
        Map<String, String> mutable = new HashMap<>();
        mutable.put("first", "Akhmad");
        mutable.put("middle", "wildan");
        mutable.put("last", "danu");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> immutableMAp2 = Map.of(
                "first", "wildan",
                "last", "Danu"
        );

        //immutable.put("error", "ups"); // ERROR
        //immutableMAp2.put("error", "ups"); //ERROR
    }
}
