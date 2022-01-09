package Application;

import ClassOOP.Enum.Customer;
import ClassOOP.Enum.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Wildan");
        customer.setLevel(Level.STANDARD);
        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());
        System.out.println("    ");
        System.out.println("Iterasi");

        for (Level value : Level.values()){
            System.out.println(value.getDescription());
        }
        System.out.println(" ");
        customer.getLevel().setDescription("ini standard kah?");
        System.out.println(customer.getLevel().getDescription());

        Customer level = new Customer();
        level.setLevel(Level.valueOf("VIP"));
        System.out.println(level.getLevel());
        String levelName = Level.VIP.name();
        System.out.println(levelName);


    }
}
