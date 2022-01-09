package ClassOOP.javaRecord;

public class Application {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("wildan", "rahasia");


        System.out.println(loginRequest.username());
        System.out.println(loginRequest.pasword());
        System.out.println(loginRequest.toString());
        loginRequest.social();
        LoginRequest.alsoSocial();

        System.out.println(new LoginRequest("akhmad"));
        System.out.println(new LoginRequest());
    }
}
