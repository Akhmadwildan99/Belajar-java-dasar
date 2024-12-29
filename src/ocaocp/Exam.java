package ocaocp;

public class Exam {
    private String name;
    private Exam other;

     public Exam(String name) {
         this.name = name;
     }

     public void setOther(Exam other) {
         this.other = other;
     }

    public static void main(String[] args) {
        Exam php = new Exam("PHP");
        Exam java = new Exam("Java");

        php.setOther(java);
        java.setOther(php);

        php =null;
        java= null;
    }
}
