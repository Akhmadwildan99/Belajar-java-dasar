package Util;

public class NumberPrinter implements Runnable{
    private int start;
    private int end;
    private String name;

    public NumberPrinter(int start, int end, String name) {
        this.start = start;
        this.end = end;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            System.out.println(name+ " sedang menjalankan: "+ i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
