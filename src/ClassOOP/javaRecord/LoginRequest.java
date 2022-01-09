package ClassOOP.javaRecord;

public record LoginRequest(String username, String pasword) implements SocialMedia{

    public LoginRequest {
        System.out.println("Ini dieksekusi terlebih dahulu!");
    }

    public LoginRequest(String username){
        this(username, "kosong ajalah!");
    }

    public LoginRequest(){
        this("", "");
    }


    public void social() {
        System.out.println("When your loogin in social media and post something what about your privacy, are you ready for lost your privacy?");
    }

    public static void alsoSocial(){
        System.out.println("wuiwi");
    }
}
