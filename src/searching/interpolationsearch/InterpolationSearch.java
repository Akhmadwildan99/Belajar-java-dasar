package searching.interpolationsearch;

public class InterpolationSearch {

    int search(int[] arr, int key) {
        int high = arr.length - 1;
        int low = 0;


        while (low <= high && key >= arr[low] && key <= arr[high]) {
            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if(arr[pos] == key) {
                return pos;
            }

            if(arr[pos] < key) {
                low = pos + 1;
            }else  {
                high = pos - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        System.out.println(interpolationSearch.search(arr, 90));
    }
}
