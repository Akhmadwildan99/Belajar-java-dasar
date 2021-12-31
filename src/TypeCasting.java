public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting (Automatically)
        byte num = 5;
        int num2 = num;

        System.out.println(num2);

//        Narrow Casting (Manually)

        int num3 = 22495;
        short num4 = (short) num3;

        System.out.println(num3);
        System.out.println(num4);
    }
}
