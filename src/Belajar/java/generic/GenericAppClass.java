package Belajar.java.generic;

public class GenericAppClass<T> {

    private T data;

    public GenericAppClass(T data) {
        this.data = data;
    }

    public GenericAppClass() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
