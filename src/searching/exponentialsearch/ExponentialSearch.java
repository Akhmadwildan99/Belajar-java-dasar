package searching.exponentialsearch;

public class ExponentialSearch {

    int binarySearch(int[] array, int low, int high ,int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }


    int exponentialSearch(int[] array, int x) {
        if(array[0] == x) {
            return 0;
        }
        int i= 1;

        while (i < array.length && array[i] <= x) {
            i *=2;
        }

        return binarySearch(array, i/2, Math.min(array.length - 1, i), x);
    }


    public static void main(String[] args) {
        int arr[] = {6, 11, 19, 24, 33, 54, 67, 81, 94, 99};
        ExponentialSearch exponentialSearch = new ExponentialSearch();
        int res = exponentialSearch.exponentialSearch(arr, 95);

        System.out.println(res);
    }
}
