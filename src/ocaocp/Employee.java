package ocaocp;

public class Employee {
    String name;


    public Employee(String name) {
        this.name = name;
    }


    public int daysOffWork(int g, int... days) {
        int daysOff = 0;
        for (int day : days) {
            daysOff += day;
        }
        return daysOff;
    }

    {
        System.out.println("Employee:initializer 1" );
    }

    public Employee() {
        System.out.println("Employee:constructor" );
    }

    {
        System.out.println("Employee:initializer 2" );
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
    }
}
