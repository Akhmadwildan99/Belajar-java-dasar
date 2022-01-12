package Class.Class.Standard.Java;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalenderApp {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        Long millisecond = date.getTime();
        System.out.println(millisecond);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        calendar.set(Calendar.YEAR, 1999);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH, 12);
        calendar.set(Calendar.HOUR_OF_DAY, 2);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 45);
        calendar.set(Calendar.MILLISECOND, 44);

        Date myBorn = calendar.getTime();
        System.out.println(myBorn);

        Long millisecondBorn = myBorn.getTime();
        System.out.println(millisecondBorn);

    }
}
