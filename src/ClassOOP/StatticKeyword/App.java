package ClassOOP.StatticKeyword;

public class App {
    public static void main(String[] args) {

        /**
         * untuk mengambil data variabel dengan static keyword
         * kita tidak perlu membuat objectnya terlebih dahulu, beitu juga dengn method static
         * dan inner class static
         */
        System.out.println(Student.TINGKAT);
        System.out.println(Student.SEKOLAH);

        System.out.println(MathUtil.sum(1, 2, 3, 4 ,4 ));

        /**
         * Pada inner class static kita tidak bisa mengakses data outer classnya
         */
        Country.City city = new Country.City();
        city.setName("Brebes");
        Country country = new Country();
        country.setName("Indonesia");

        System.out.println(city.getName());
        System.out.println(country.getName());
    }
}
