package Class.Class.Standard.Java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysApp {

    public static void main(String[] args) {

        // Sort
        int[] num = {1, 3, 4 ,5 ,6};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int[] num2 = {
                3, 5, 6,78, 0,7, 5,6, 88,34, 5
        };
        Arrays.sort(num2, 4, 11);
        System.out.println(Arrays.toString(num2));

        int[] num3 = {
                1, 3, 5, 4, 98, 8, 6, 5, 9
        };

        Arrays.parallelSort(num3);
        System.out.println(Arrays.toString(num3));

        int[] num4 = {
                1, 2,3, 4, 4, 4,6,5, 6, 7, 8, 4
        };
        int res = Arrays.binarySearch(num4, 0, 6, 4);
        System.out.println(res);

        int[] num5 = {
                4, 5, 6, 7, 8, 9,2, 5,4 ,5
        };
        int[] newArr = Arrays.copyOf(num5, 5);
        for(var item : newArr){
            System.out.println(item);
        }

        System.out.println(" ");
        int[] newArr2 = Arrays.copyOfRange(num5, 0, 4);
        for(var item : newArr2){
            System.out.println(item);
        }

        System.out.println(Arrays.equals(num2, num3));

    }
}
