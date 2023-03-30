
interface Bicycle {
    int a = 45;// properties are final by default in interface

    void applyBrake(int decrement);

    void speedUp(int increment);
}

class AvonCycle implements Bicycle {
    void blowHorn() {
        System.out.println("pee pee poo poo...");
    }

    // when you are implementing methods of an interface, you must have to make them
    // public
    public void speedUp(int increment) {
        System.out.println("Speed up");
    }

    public void applyBrake(int a) {
        System.err.println("applying brake");
    }

}

public class Vd_54_interfaaces {
    public static void main(String[] args) {
        // in interface, all methods are considered to be abstract
        AvonCycle avonCycle = new AvonCycle();
        avonCycle.applyBrake(1);
        // you can access prioperties of interface like bellow
        System.out.println(avonCycle.a);
        // but you can't modify properties of interface like bellow
        // avonCycle.a = 444; --- throws error because a is final
    }
}
