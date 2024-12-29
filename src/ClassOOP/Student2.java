package ClassOOP;

public class Student2 {

    private String name;
    private String nik;


    public static void main(String[] args) {
        Student2 mulyono = new Student2();
        mulyono.name = "Mulyono";
        mulyono.nik = "333";

        Student2 budi = mulyono;
        budi.name = "Budi";
        budi.nik= "222";


        System.out.println("mulyono: "+ mulyono.name);
        System.out.println("budi: "+ budi.name);

    }
}
