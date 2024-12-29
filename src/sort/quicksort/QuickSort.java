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


    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5, 22, 2, 3, 42, 11};


        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));


    }


}
