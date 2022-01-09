package ClassOOP;

import ClassOOP.Error.ValidationException;
import ClassOOP.javaRecord.LoginRequest;

public class ValidationUtil {
    public  void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
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
}
