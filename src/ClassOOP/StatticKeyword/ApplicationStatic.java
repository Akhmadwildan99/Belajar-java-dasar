package ClassOOP.StatticKeyword;

public class ApplicationStatic {

    public static final int PROCESSORS;
    static {
        System.out.println("akses static dulu sebelum classnya");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
