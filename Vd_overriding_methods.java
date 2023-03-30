
class A {
    public int a;

    public int harry() {
        return 4;
    }

    public void method2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    public void method3() {
        System.out.println("I am method 2 of class A");
    }

    // making same method which is already present in the parent class in child
    // class and writing different coded in that child class method is called
    // overriding. It is better to write @Override annotaion above that method which
    // is overrided in child class like bellow.
    @Override
    public void method2() {
        System.out.println("I am method 2 of class B");
    }
}

public class Vd_overriding_methods {
    public static void main(String[] args) {
        B b = new B();
        b.method2();
    }
}
