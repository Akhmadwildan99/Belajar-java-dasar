package Class.Class.Standard.Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("[a-zA-Z]*[a-z]");
        Matcher m = p.matcher("akhmad Wildan");

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
