package ClassOOP;


import Application.Cat;
import ClassOOP.modifier.Product;

public class ClassMethod {
    public static void main(String[] args) {
        OOPJava formula1 = new OOPJava();
        formula1.driverName("Valteri Bottas", "Alfa Romeo", 0);
        formula1.driverName("Sebastian Vettel", "Aston Martin", 4);

        Employee employee = new Employee("Akhmad", 5);
        System.out.println(employee.employeeName);
        System.out.println(employee.employeeYear);


        Product productApp = new Product("Mac book pro", 30_000_000);
        System.out.println(productApp.product);
        System.out.println(productApp.price);

        Cat bird = new Cat("dara", 2);
        bird.habitat();



    }
}
