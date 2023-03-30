import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Vd_100_java_time {
    public static void main(String[] args) {
        // we will discuss main classes in java.time package
        // 1. LocalDate
        LocalDate d = LocalDate.now();
        System.out.println(d);// to print current dates

        LocalTime t = LocalTime.now();
        System.out.println(t);// to print current time

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);// to print both date and time. Its benifit is that it also gives time in
                               // nanoseconds
    }
}
