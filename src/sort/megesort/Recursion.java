package sort.megesort;

public class Recursion {

    static void recursion(int n) {

        if (n == 0) {
        } else {
            recursion(n-1);
            System.out.printf("%d ", n -1);
        }
    }
    public static void main(String[] args) {
        recursion(50);
    }
}
