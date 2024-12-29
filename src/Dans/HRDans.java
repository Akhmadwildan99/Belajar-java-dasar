package Dans;

import java.util.*;

public class HRDans {

    public static void main(String[] args) {

        String records =   "Bandung,Bob Bandung,Criss Jakarta,Zifa Makassar,Isla Bandung,Ronal";

        String[] s =records.split(" ");

        Map<String, List<String>> ret = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            String key = s[i].split(",")[0];
            String value = s[i].split(",")[1];

            if(ret.containsKey(key)) {
                ret.get(key).add(value);
            } else {
                ret.put(key, List.of(value));
            }

        }

        System.out.println(ret.toString());

//        String input = "Bandung,Bob Bandung,Criss Jakarta,Zifa Makassar,Isla Bandung,Ronal";
//        String[] tokens = input.split(" ");
//
//        Map<String, List<String>> groupedCVs = new HashMap<>();
//
//        for (int i = 0; i < tokens.length; i += 2) {
//            String location = tokens[i];
//            String candidateName = tokens[i + 1];
//
//            if (!groupedCVs.containsKey(location)) {
//                groupedCVs.put(location, new ArrayList<>());
//            }
//
//            groupedCVs.get(location).add(candidateName);
//        }
//
//        for (Map.Entry<String, List<String>> entry : groupedCVs.entrySet()) {
//            String location = entry.getKey();
//            List<String> candidateNames = entry.getValue();
//
//            System.out.println(location + ":" + String.join(", ", candidateNames));
//        }
    }
}
