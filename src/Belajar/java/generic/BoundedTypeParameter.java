package Belajar.java.generic;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        System.out.println("bounded Type Parameter:");
        NumberData<Integer> data = new NumberData<>(6);
        System.out.println(data.getData());
        System.out.println("Multiple bounded Type Parameter:");
        VicePresident vicePresident = new VicePresident("eko");
        Data<VicePresident> data1 = new Data<>(vicePresident);
        System.out.println(data1.getData());
    }

    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data=" + data +
                    '}';
        }
    }

    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static class Employee {

    }

    public static class Manager extends Employee{

    }

    public static class VicePresident extends Employee implements CanSayHello{
        private  String name;

        public VicePresident(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void sayHello(String name) {
            System.out.println(name);
        }

        @Override
        public String toString() {
            return "VicePresident{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
