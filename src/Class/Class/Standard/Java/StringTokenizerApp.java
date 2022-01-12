package Class.Class.Standard.Java;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String me = "Akhmad wildan Danu Nanu";
        StringTokenizer tokenizer = new StringTokenizer(me, " ");

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
