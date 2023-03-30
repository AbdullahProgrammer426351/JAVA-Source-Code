
interface SampleInterface {
    void meth1();

    void meth2();
}

interface AnotherInterface extends SampleInterface {
    void meth3();

    void meth4();
}

class InterfaceChildClass implements AnotherInterface {

    @Override
    public void meth1() {
        // TODO Auto-generated method stub
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        // TODO Auto-generated method stub
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        // TODO Auto-generated method stub
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        // TODO Auto-generated method stub
        System.out.println("meth4");

    }

}

public class Vd_57_inheritance_interfaces {
    public static void main(String[] args) {
        InterfaceChildClass obj = new InterfaceChildClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
