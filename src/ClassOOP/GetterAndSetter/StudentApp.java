package ClassOOP.GetterAndSetter;

import ClassOOP.InnerClass.DriverF1;

public class StudentApp {
    public static void main(String[] args) {
        Student akhmad = new Student();
        akhmad.setName("Akhmad");
        akhmad.setNoAbsen(3);
        System.out.println(akhmad.getName());
        System.out.println(akhmad.getNoAbsen());

        DriverF1 max = new DriverF1();
        max.setDriverName("Max Verstappen");
        DriverF1.F1Team redBull = max.new F1Team();
        redBull.setTeamName("Red Bull");
        System.out.println(max.getDriverName() + " membalap untuk " + redBull.getTeamName());
    }
}
