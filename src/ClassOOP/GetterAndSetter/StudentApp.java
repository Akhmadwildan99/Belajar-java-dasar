package ClassOOP.GetterAndSetter;

public class StudentApp {
    public static void main(String[] args) {
        Student akhmad = new Student();
        akhmad.setName("Akhmad");
        akhmad.setNoAbsen(3);
        System.out.println(akhmad.getName());
        System.out.println(akhmad.getNoAbsen());
    }
}
