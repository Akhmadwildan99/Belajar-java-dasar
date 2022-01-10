package ClassOOP;

import ClassOOP.Error.BlankException;
import ClassOOP.Error.ValidationException;
import ClassOOP.javaRecord.LoginRequest;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null!");
        } else if (loginRequest.username().isBlank()){
            throw new ValidationException("Username is Blank!");
        } else if (loginRequest.pasword() ==null){
            throw new NullPointerException("Password is null!");
        } else if (loginRequest.pasword().isBlank()){
            throw new ValidationException("Password is Blank!");
        }
    }

    public static void validationRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new BlankException("Username is blank!");
        } else if (loginRequest.pasword() == null){
            throw new NullPointerException("Passwowrd is null");
        } else if (loginRequest.pasword().isBlank()){
            throw new BlankException("Password is blank");
        }
    }
}
