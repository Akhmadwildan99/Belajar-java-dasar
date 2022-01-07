package ClassOOP.equelasAndHashCode;

public class ProductApp {

    public static void main(String[] args) {
        Product apple = new Product();
        apple.setName("Mac Book");

        Product macintosh = new Product();
        macintosh.setName("Mac Book");

        System.out.println(apple.getName().equals(macintosh.getName()));

        System.out.println(apple.getName());

        System.out.println(apple.hashCode() == macintosh.hashCode());
        System.out.println(macintosh.hashCode());
    }
}
