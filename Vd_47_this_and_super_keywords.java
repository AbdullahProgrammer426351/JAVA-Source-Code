
class EkClass {
    int a;

    public int getA() {
        return a;
    }

    // making the conrtuctor
    // EkClass(int v) {
    // // if we name variables by different names
    // // a = v;
    // }

    // But when we make same names, then we have to use 'this', otherwise compiler
    // will be confused, example :
    EkClass(int a) {
        this.a = a;
    }

    public int returnOne() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int c) {
        // it is giving error if we not use super keyword because it will execute the
        // default cocnstructor. and parent class has no default constructor(with no
        // arguments as input), but isf we use super then we will specify the
        // constructor of parent class with it.
        super(c);
        System.out.println("Main ek constructor hoon");
    }
}

public class Vd_47_this_and_super_keywords {

    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        DoClass d = new DoClass(65);
        System.out.println(e.getA());
    }
}
