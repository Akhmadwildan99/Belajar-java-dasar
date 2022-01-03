package ClassOOP.Inheritence;

public class F1App {
    public static void main(String[] args) {
        DriverF1 alonso = new DriverF1();
        alonso.setName("Alpine");
        alonso.setDriverNameName("Fernando Alonso");
        alonso.race();
        System.out.println(alonso.getName());
        System.out.println(alonso.getDriverNameName());
    }
}
