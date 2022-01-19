package Belajar.java.generic;

public class CovariantApp {
    public static void main(String[] args) {

        InvariantApp invariantApp = new InvariantApp();
        InvariantApp.Data<String> data = invariantApp.new Data<>();
        data.setData("StringApp");
        process(data);


    }

    public static void process(InvariantApp.Data<? extends Object> data){
        System.out.println(data.getData());

        //data.setData("sss"); ini error
    }
}
