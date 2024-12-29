package ocaocp;

public class Test {

    public static void resetValueOfMemberVariable(Person p1) {
        p1.setName("Rodrigo");
    }

    public static void main(String[] args) {
//        Person person1 = new Person("Paul");
//
//        System.out.println(person1.getName());
//
//        resetValueOfMemberVariable(person1);
//
//        System.out.println(person1.getName());


        String name1 = "Wildan";
        String name2 = name1.substring(2, 4);

        System.out.println(name1);
        System.out.println(name2);
    }
}
