import Util.NumberPrinter;

public class MyThread {
    public static void main(String[] args) {
        Thread thread1= new Thread(new NumberPrinter( 1, 5, "Thread 1"));
        Thread thread2= new Thread(new NumberPrinter( 1, 5, "Thread 2"));

        thread1.start();
        thread2.start();
    }
}
