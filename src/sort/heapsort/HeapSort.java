package sort.heapsort;

import java.util.Arrays;

public class HeapSort {

    static void buildMaxHeap(int[] arr, int n) {

    }

    static void sort(int[] arr, int n) {

        for (int i = n / 2 - 1; i >= 0; i--) {
            System.out.println(i + " ::::" );
            maxHeap(arr, n, i);
        }


        for (int i = n -1; i > 0; i--) {
            System.out.println(Arrays.toString(arr));
            int temp = arr[0];
             arr[0] = arr[i];
             arr[i] = temp;
            System.out.println("+=======+");
            maxHeap(arr, i, 0);
        }
    }

    static void maxHeap(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        System.out.println("largest: "+ largest+ " left: "+ left+ " right: "+ right);

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        System.out.println("largest2: "+ largest+ " left2: "+ left+ " right2: "+ right);

        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeap(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 39, 49, 20, 34};

        sort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
