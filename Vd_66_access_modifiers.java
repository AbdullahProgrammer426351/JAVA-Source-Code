class C1 {
    public int x = 5;// public modifier
    protected int y = 67;// protected modifier
    int z = 6;// default (no) modifier
    private int a = 45;// private modifier

    public void meth1() {
        // all access modifiers can be accessed in inner methods of the same class
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Vd_66_access_modifiers {

    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
        // all access modifiers can be accessed within the package except private
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); ---> not allowed and giving error because of private

        // public ---- can be accessed from anywhere
        // protected ---- can be accessed in same class, package and in that subclass
        // that extends that class in which this property is used
        // default ---- can be access in same class and package not in subclass
        // private ---- can be accessed only in same class
        // NOTE : For more information, image is added in this folder
    }
}
