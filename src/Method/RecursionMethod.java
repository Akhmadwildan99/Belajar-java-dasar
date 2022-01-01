package Method;

public class RecursionMethod {
    public static void main(String[] args) {
        int result = vaktorial(3);
        System.out.println(result);
    }

    public static int vaktorial(int vak) {
        if (vak > 1) {
            return vak * vaktorial(vak - 1);
        } else {
            return  1;
        }
    }
}
