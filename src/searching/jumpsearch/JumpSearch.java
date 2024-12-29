package searching.jumpsearch;

public class JumpSearch {

    int search(int[] arr, int length, int key) {
        int i = 0;
        int m = (int)Math.sqrt(length);
        int k = m;

        while (arr[m] <= key && m < length) {
            i= m;
            m += k;
            if(m > length -1) {
                return -1;
            }
        }

        for (int j = i; j < m; j++) {
            if(arr[j] == key) {
                return j;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {0, 6, 12, 14, 19, 22, 48, 66, 79, 88, 104, 126};
        JumpSearch jumpSearch = new JumpSearch();
        int res = jumpSearch.search(arr, arr.length, 1);

        System.out.println(res);
    }
}
