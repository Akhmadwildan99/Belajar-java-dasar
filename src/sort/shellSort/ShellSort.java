package sort.shellSort;

import java.util.Arrays;

public class ShellSort {

    static void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n/2; gap > 0 ; gap/=2) {
//            System.out.println("gap:" + gap);
            for (int i = gap; i < n ; i++) {

                int temp = arr[i];

//                System.out.println("temp:" + temp);

                int j;
                for(j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
//                    System.out.println("arr[j - gap]:" + arr[j - gap]);
                }
                arr[j] = temp;

            }

            System.out.println("Prosess");
            System.out.println(Arrays.toString(arr));
        }
    }

    static void shellSort2(int[] arr) {
        int n = arr.length;
        int gap, j, k;

        for(gap = n/2; gap > 0; gap/=2) {
            for(j= gap; j < n; j++) {
                System.out.println("J: "+j);
                for(k = j - gap; k >= 0; k -= gap) {
                    System.out.println("K: "+k);
                    if(arr[k] <= arr[k + gap]) {
                        break;
                    } else {
                        int temp = arr[k+ gap];
                        arr[k+ gap] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {12, 34, 54, 8, 7, 6, 5, 4, 3,2,1};
//        shellSort2(arr);
//        System.out.println("Hasil: ");
//        System.out.println(Arrays.toString(arr));

        System.out.println(0/2);
    }
}
