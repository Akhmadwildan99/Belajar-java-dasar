package Application;

import ClassOOP.modifier.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Acer", 5000000);
        System.out.println(product.product);
        System.out.println(product.price);
    }
}
