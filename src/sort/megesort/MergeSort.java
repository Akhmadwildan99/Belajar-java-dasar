package sort.megesort;

public class MergeSort {

    static void merge(int arr[], int start, int mid, int end) {
        int n1= mid - start+1;
        int n2= end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];

        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + j+ 1];
        }


        int l=0,r= 0, k=start;


        while(l < n1 && r < n2){
            if(left[l] <= right[r]) {
                arr[k] = left[l];
                l++;
            } else {
                arr[k] = right[r];
                r++;
            }
            k++;
        }

        while(l < n1) {
            arr[k] = left[l];
            l++;
            k++;
        }

        while(r < n2) {
            arr[k] = right[r];
            r++;
            k++;
        }

    }

    static void mergeDesc(int arr[], int start, int mid, int end) {
        int n1= mid - start+1;
        int n2= end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];

        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + j+ 1];
        }

        int l=0,r= 0, k=start;

        while(l < n1 && r < n2){
            if(left[l] > right[r]) {
                arr[k] = left[l];
                l++;
            } else {
                arr[k] = right[r];
                r++;
            }
            k++;
        }

        while(l < n1) {
            arr[k] = left[l];
            l++;
            k++;
        }

        while(r < n2) {
            arr[k] = right[r];
            r++;
            k++;
        }
    }


    static void sort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (right + left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void sortDesc(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (right + left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            mergeDesc(arr, left, mid, right);
        }
    }
    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1,5,6};
        sortDesc(arr, 0, arr.length - 1);

        for (int a: arr){
            System.out.print(a);
        }
    }
}
