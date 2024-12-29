package sort.bublesort;

public class BubleSort {

    static void sort(int[] arr, boolean isDesc)
    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int swap = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if(isDesc) {
                    if(arr[j] < arr[j+1]) {
                        swapPlace(arr, j);
                        swap= 1;
                    }
                } else {
                    if(arr[j] > arr[j+1]) {
                        swapPlace(arr, j);
                        swap= 1;
                    }
                }

            }

            if(swap == 0) break;
        }
    }


    static void swapPlace(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 90, 33, 2,3, 4, 4,4 ,4, 5};
        sort(arr, true);



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        sort(arr, false);

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
