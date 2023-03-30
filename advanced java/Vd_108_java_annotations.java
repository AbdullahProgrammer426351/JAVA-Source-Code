class Parent {
    public void show() {
        System.out.println("This is parent");
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void thisMethod();
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("This is child");
    }

    @Deprecated
    public void dep() {
        System.out.println("This method is deprecated");
    }

    @Deprecated
    int dep = 99;
}

public class Vd_108_java_annotations {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation") // used to ignore deprecation warnings
        Child child = new Child();
        child.show();
        child.dep();
        System.out.println("dept int : " + child.dep);

    }

    /*
     * Annotations are used to mention where java compiler have to change its
     * behaviour. The compiler shows warninng according to annotations in run
     * section in android studio (android studio is taken as example)
     * 1. Override--> to mention where we have override function, helpful in logic
     * building and debugging.
     * 2. Deprecated --> to mention that the specified method is deprecated. and
     * when we use it, strikethrough line appears on that method
     * 3. SuppressWarnings --> to ignore warnings at some place in code
     * 4. FunctionalInterface --> used to tell the compiler that which interface is
     * functional or not. A functional interface is that interface which has only
     * one abstract(unimplemented) method. this annotation will give error when
     * programmer will make more than one methods in that interface on which this
     * annotation is mentioned
     */
}
