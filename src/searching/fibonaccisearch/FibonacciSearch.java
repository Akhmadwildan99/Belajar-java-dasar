package searching.fibonaccisearch;

public class FibonacciSearch {
    int min(int a, int b) {
        return Math.min(a, b);
    }
    int search(int[] arr, int x) {

        // mencari bilangan fibonaci terakhir beradasarkan length arr
        int fm2= 0;
        int fm1 = 1;
        int fm = fm2+ fm1;

        int n = arr.length;
        int offset= -1;

        if(x > arr[n -1]) {
            return -1;
        }

        while (fm < n) {
            fm2= fm1;
            fm1= fm;
            fm = fm2+ fm1;
        }

        while (fm > 1) {
            int i= min(offset+ fm2, n - 1);

//            System.out.println("offset: " + offset + " i: " + i + " arr[i]: " + arr[i]);
//            System.out.println("fm: " + fm+ " fm1: " + fm1+ " fm2: " + fm2);
//            System.out.println("size: " + (n-1));
//            System.out.println(" ");


            if(arr[i] < x) {
                fm = fm1;
                fm1= fm2;
                fm2 = fm - fm1;
                offset = i;
            } else if (arr[i] > x) {
                fm = fm2;
                fm1= fm1- fm2;
                fm2= fm - fm1;
            } else {
                return i;
            }
        }

        if(arr[offset+ 1] == x && fm1 == 1) {
            return offset + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {6, 11, 19, 24, 33, 54, 67, 81, 94, 99};

        int res = new FibonacciSearch().search(arr, 67);

        System.out.println(res);
    }
}
