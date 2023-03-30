
interface DemoAno {
    void meth1();

    void meth2();
}

class AnonyDemo implements DemoAno {
    public void display() {
        System.out.println("Hellow");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth 1");

    }

    @Override
    public void meth2() {
        System.out.println("I am meth 2");

    }
}

public class Vd_109_lambda_expressions_and_anonymous_classes {

    public static void main(String[] args) {
        // AnonyDemo obj = new AnonyDemo();
        // obj.meth1();
        // But we can do different from above code if we have to use meth1() only one
        // time by initializing the interface instead of class.
        // Anonymous class
        DemoAno obj = new DemoAno() {

            @Override
            public void meth1() {
                System.out.println("I am meth 1 by interface");

            }

            @Override
            public void meth2() {
                System.out.println("I am meth 2 by interface");

            }

        };
        // calling anonymous class functions with interface object
        obj.meth1();
        // It can be helpful where you have not to re use the methods of an interface.
        // You can use its methods by using above method instead of making a class and
        // implementing interface by it.
    }
}
