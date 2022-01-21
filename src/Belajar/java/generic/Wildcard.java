package Belajar.java.generic;

public class Wildcard<T> {

    private  T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Wildcard(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        printLength(new Wildcard<>(444));
        printLength(new Wildcard<>("eko"));
        printLength(new Wildcard<>(4000));
    }

    public static void printLength(Wildcard <?> wildcard){
        System.out.println(wildcard.getData());
    }
}
