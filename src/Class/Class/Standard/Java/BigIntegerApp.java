package Class.Class.Standard.Java;

import java.math.BigInteger;

public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000000000000000");
        BigInteger b = new BigInteger("9099999990000000000");
        BigInteger res = a.add(b);
        System.out.println(res);
    }


}
