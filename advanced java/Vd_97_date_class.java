import java.util.Date;

public class Vd_97_date_class {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);// current date printing
        System.out.println(d.getTime());// prints current time in milli seconds
        System.out.println(d.getDate());// prints current date
        System.out.println(d.getYear());// prints current year
        System.out.println(d.getSeconds());// prints current seconds
    }
}
