package ocaocp;

public class Phone {
    private String phoneNumber = "123456789";
    public void setNumber() {
        String phoneNumber;
        phoneNumber = "987654321";
    }


    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setNumber();

        System.out.println(phone.phoneNumber);
    }
}
