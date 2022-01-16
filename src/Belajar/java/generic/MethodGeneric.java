package Belajar.java.generic;

public class MethodGeneric {
    public static <T> void ArrMethod(T[] array){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null){
                builder.append(array[i]);
            }
        }
        System.out.println(builder.toString());
    }
}
