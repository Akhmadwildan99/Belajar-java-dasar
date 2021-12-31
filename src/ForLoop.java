public class ForLoop {
    public static void main(String[] args) {
        int masuk = 90;

        for (int i = 0; i <= masuk; i++) {
            if (i % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }
        }


        String[] mobil = {"nissan", "avanza", "volvo"};

        for (String i : mobil) {
            System.out.println(i);

        }
    }


}
