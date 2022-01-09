package Application;

import ClassOOP.Error.ValidationException;
import ClassOOP.ValidationUtil;
import ClassOOP.javaRecord.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("wildan","rahasia");

        ValidationUtil validationUtil = new ValidationUtil();
        try {
            validationUtil.validate(loginRequest);
            System.out.println("Berhasil");
        } catch (ValidationException | NullPointerException execption){
            System.out.println("Sistem error di: " + execption.getMessage());
        } finally {
            System.out.println("apapun yang terjasi tetap dieksekusi");
        }
    }
}
