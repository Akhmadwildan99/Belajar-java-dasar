import org.w3c.dom.ls.LSOutput;

public class ifElseCondition {
    public static void main(String[] args) {
        // Common if else condition

        int time = 27;

        if(time < 10) {
            System.out.println("Good Morning");
        } else if(time < 18) {
            System.out.println("Good Afternoon");
        } else if(time >= 18 && time <= 24) {
            System.out.println("Good evening");
        } else {
            System.out.println("Not Time dude");
        }


//        int time2 = 20;
//        String result = (time2 < 18) ? "Good day." : "Good evening.";
//        System.out.println(result);

        int time2  = 5;
        String result = ( time2 < 10 )  ? "Good morning" : "Good Day";
        System.out.println(result);
    }




}
