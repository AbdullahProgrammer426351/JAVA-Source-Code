import javax.swing.event.SwingPropertyChangeSupport;

abstract class Parent2 {
    public Parent2() {
        System.out.println("Main base2 ka constructor hon...");
    }

    public void sayHellow() {
        System.out.println("Hellow");
    }

    abstract public void greet();
    // above method is abstract, it can be overrided after this. and we have to make
    // this class abstract.
}

class Child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
}

abstract class Child3 extends Parent2 {
    public void th() {
        System.out.println("th");
    }
}

abstract class DemoAbstractClass {
    abstract void one();

    abstract void two();
}

public class Vd_53_abstract_class {
    public static void main(String[] args) {
        // abstract mean -- khayali palao (only idea not practical)
        // abstract method --- such method that is not implemented but only
        // initiallized.
        // and such class which contains atleast one abstract method is called abstract
        // class
        // we cannot make the object of abstract class but we can use it only from its
        // other child classes. and you must have to implement(override) those methods
        // in those classes which extend that abstract class or you have to make that
        // child class also abstract... otherwise you will face error.

        // Parent2 p = new Parent2(); -- throws error
        // Child3 c = new Child3(); -- throws error
        Child2 ch = new Child2(); // --- valid
        // if you want to make object of abstract class, then you must have to implement
        // its abstract method when you will create that object as follows :
        DemoAbstractClass demo = new DemoAbstractClass() {

            @Override
            void one() {
                // TODO Auto-generated method stub
            }

            @Override
            void two() {
                // TODO Auto-generated method stub

            }

        };
    }
}
