package sort.quicksort;

import java.util.Arrays;

public class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] a, int low, int high) {
        int pv= a[high];
        int i = low-1;

        for (int j = low; j < high; j++) {

            if (a[j] < pv) {
                i++;
                swap(a, i, j);
            }

        }

       swap(a, i+1, high);


        return i+1;
    }

    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high);
            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }
    }


    static boolean kabisat(int tahun) {
        if((tahun % 4 == 0 && tahun % 100 != 0)|| tahun % 400 == 0) {
            System.out.println("Kabisat");
            return true;
        }
        System.out.println("Bukan Kabisat");
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5, 22, 2, 3, 42, 11};


        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

//        kabisat(2018);
//        kabisat(2020);
//        kabisat(2016);
//        kabisat(2014);
//        kabisat(800);
//
//        kabisat(1600);
//        kabisat(1800);

    }


}
