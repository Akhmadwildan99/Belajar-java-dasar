package Belajar.java.generic;

public class InvariantApp {
    public  class Data <T>{
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        InvariantApp invariantApp = new InvariantApp();
        InvariantApp.Data<String> data = invariantApp.new Data<>();
        data.setData("data");
        String get = data.getData();
        System.out.println(get);
        //InvariantApp.Data<Integer> myInt = data; //Ini error invariant
    }
}
