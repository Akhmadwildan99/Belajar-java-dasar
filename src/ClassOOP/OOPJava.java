package ClassOOP;

public class OOPJava {
    int num =  5;
    String name = "Wildan";

    static void driverName(String name, String team) {
        System.out.println(name + " membalap untuk " + team + " team.");
    }

    public void driverName(String name, String team, int juaraDunia) {
        if (juaraDunia < 1) {
            System.out.println(name + " membalap untuk " + team + " team.");
        } else {
            System.out.println(name + " membalap untuk " + team + " team dan sudah meraih " + juaraDunia + " kali juara dunia.");
        }
    }

    public static void main(String[] args) {
        OOPJava lima = new OOPJava();
        System.out.println(lima.num);
        System.out.println(lima.name);

        lima.name = "Akhmad";
        System.out.println(lima.name);


//        Static void dapat diacsess tanpa perlu mengakses object terlebih dahulu. Tetapi tidak bisa diakses di class lain.

        driverName("George Russel", "Mercedess AMG");
    }
}
