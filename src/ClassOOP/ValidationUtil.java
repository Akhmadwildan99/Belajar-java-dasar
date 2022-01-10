package ClassOOP;

import ClassOOP.Annotation.NotBlank;
import ClassOOP.Error.BlankException;
import ClassOOP.Error.ValidationException;
import ClassOOP.javaRecord.LoginRequest;

import java.lang.reflect.Field;

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


    public static void validateReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields){
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null){
                // Validate

                try {
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank!");
                    }
                } catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
