package searching.binarysearch;

public class BinarySearch {

    int binarySearch(int[] arr,int low, int high, int x) {

        if(high >= low) {
            int mid = low + (high - low) / 2;
            System.out.println("process: "+ mid + " low: " + low + " high: " + high);

            if(arr[mid] == x) {
                return mid;
            }

            if(arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, high, x);
        }

        return -1;
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(bs.binarySearch(arr,0,arr.length-1,10));
    }
}
