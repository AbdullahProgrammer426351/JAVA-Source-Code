import java.util.Calendar;
import java.util.TimeZone;

public class Vd_98_calendar_class {
    public static void main(String[] args) {
        // NOTE : calendar class is an abstract class
        // But it has a static method that gives its instance
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());// returns calendar type
        // System.out.println(c.getTimeZone());// returns time zone of device

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        // it will set time zone according to you
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());// get id of time zone
        System.out.println(c.getTime());// gives the time
    }
}
