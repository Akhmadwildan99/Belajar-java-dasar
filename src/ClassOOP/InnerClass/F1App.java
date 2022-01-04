package ClassOOP.InnerClass;

public class F1App {
    public static void main(String[] args) {
        DriverF1 hamilton = new DriverF1();
        hamilton.setDriverName("Lewis Hamilton");
        DriverF1.F1Team amg = hamilton.new F1Team();
        amg.setTeamName("Mercedes AMG");
        System.out.println(hamilton.getDriverName() + " membalap untuk " + amg.getTeamName());
    }
}
