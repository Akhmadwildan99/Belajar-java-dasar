package Application;

import ClassOOP.ValidationUtil;

public class ReflectionApp {

    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setPassword("jkjkjk");
        request.setUsername("wildan");


        ValidationUtil.validateReflection(request);
    }
}
