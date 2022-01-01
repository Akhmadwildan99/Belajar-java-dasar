package Method;

public class MethodParamenters {
    static void waktu(int seconds) {
        int detik =  seconds;
        int menit = 0;

        int jam = 0;

        while (detik >= 60){
            menit ++;
            detik -= 60;
        }

        while (menit >= 60) {
            jam++;
            menit -= 60;
        }

        System.out.println(jam + " jam " + menit + " menit " + detik + " detik ");
    }

    public static void main(String[] args) {
        waktu(8979);
    }
}
