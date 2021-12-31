public class WhileLoop {
    public static void main(String[] args) {
        int detik = 8090976;
        int menit = 0;
        int jam =0;
        int hari = 0;
        int bulan = 0;

        while(detik >= 60) {
            menit += 1;
            detik -= 60;
        }

        while(menit >= 60) {
            jam += 1;
            menit -= 60;
        }

        while (jam >= 24) {
            hari++;
            jam -= 24;
        }

        while (hari >= 30) {
            bulan++;
            hari-= 30;
        }

        System.out.println(bulan + " bulan " + hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik" );

        System.out.println();


//        Do while Loop;

        int angka = 0;

        do {
            angka ++;
        }while (angka < 0);

        System.out.println(angka);

    }
}
