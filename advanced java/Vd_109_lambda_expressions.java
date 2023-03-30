interface DemoAno {
    void meth1();

    // void meth2();
}

interface DemoAnoWithParameter {
    void meth1(int a);

    // void meth2();
}

// class AnonyDemo implements DemoAno {
// public void display() {
// System.out.println("Hellow");
// }

// @Override
// public void meth1() {
// System.out.println("I am meth 1");

// }

// @Override
// public void meth2() {
// System.out.println("I am meth 2");

// }
// }

// class HarryFunc implements DemoAno {

// @Override
// public void meth1() {
// System.out.println("I am meth 1");

// }

// }

public class Vd_109_lambda_expressions {
    public static void main(String[] args) {
        // DemoAno obj = new HarryFunc();
        // obj.meth1();

        // But we will not do the above steps, we will use lambda expressions intead of
        // doing above stuff

        // Note: lambda expressions can be used only for those interfaces which has only
        // one method to override(i.e functional interfaces)
        DemoAno obj = () -> {
            System.out.println("I am meth 1 from this lambda");
        };
        obj.meth1();

        // For method which take some parameters
        DemoAnoWithParameter obj2 = (a) -> {
            System.out.println("I am meth 1 from lambda of parameter, value of a is : " + a);
        };
        obj2.meth1(3);
    }
}
