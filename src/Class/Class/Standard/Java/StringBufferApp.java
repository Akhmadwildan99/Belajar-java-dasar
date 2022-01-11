package Class.Class.Standard.Java;

public class StringBufferApp {
    public static void main(String[] args) {

        // String Buffer
        StringBuffer buff = new StringBuffer("Luca ");
        buff.append("akhmad");
        buff.append(" ");
        buff.append("wildan");
        String me = buff.toString();
        System.out.println(me);



        // String Builder

        StringBuilder builder = new StringBuilder("akhmad");
        builder.append(" ");
        builder.append("wildan");
        System.out.println(builder.toString());
    }
}
