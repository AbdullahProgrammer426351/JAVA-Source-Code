
class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on phone .... ");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Music is playing ... ");
    }

    public void on() {
        System.out.println("Turning on smart phone ...");
    }
}

public class Vd_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();// reffering object of Phone class to it
        // SmartPhone objSmart = new SmartPhone();// reffering object of SmartPhone
        // class to it
        // obj.name();

        Phone obj = new SmartPhone();// allowed in java(refereing object of super class to child class)

        // but
        // SmartPhone obj2 = new Phone();// not allowed in java

        obj.showTime();
        obj.on();// on method will be executed from object not reference, this is called dynamic
                 // method dispatch (ie) we will decide this on object creation time on runtime
        // like we can say a smart phone a phone, but we cannot say a phone to
        // smartphone

        /*
         * But by. doing this, we can only use those methods which are common in both
         * classes or in super class like obj.music() is not allowed
         * 
         */
    }
}
