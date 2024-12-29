package sort.inssort;

public class insertionSort {

    static void sort(int[] arr, boolean isDesc) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int key = arr[i];

            if(isDesc) {
                while (j > 0 && arr[j - 1] < key) {
                    arr[j] = arr[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && arr[j - 1] > key) {
                    arr[j] = arr[j - 1];
                    j--;
                }
            }


            arr[j] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 90, 33, 2,3, 4, 4,4 ,4, 5};
        sort(arr, false);



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");
        sort(arr, true);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
