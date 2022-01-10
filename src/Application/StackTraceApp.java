package Application;

public class StackTraceApp {
    public static void main(String[] args) {
//        try {
//            sampleError();
//        } catch (RuntimeException exception){
//            exception.printStackTrace();
//        }
        sampleError();
    }

    public static void sampleError(){
        try {
            String[] names = {
                    "Akhmad", "Wildan"
            };
            System.out.println(names[45]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);

        }
    }


}
