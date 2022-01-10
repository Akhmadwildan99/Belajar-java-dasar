package Application;

import ClassOOP.Annotation.Fancy;
import ClassOOP.modifier.Product;

@Fancy(name = "product", tags = {"laptop", "PC"})
public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Acer", 5000000);
        System.out.println(product.product);
        System.out.println(product.price);
        System.out.println(product);
    }
}
