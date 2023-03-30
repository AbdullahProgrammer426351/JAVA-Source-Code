class MyGeneric<T1> {
    int val;
    private T1 t1;

    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return this.val;
    }

    public T1 getT1() {
        return this.t1;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

class MyGenericWithTwoParameters<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenericWithTwoParameters(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return this.val;
    }

    public T1 getT1() {
        return this.t1;
    }

    public T2 getT2() {
        return this.t2;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class Vd_110_generics {
    public static void main(String[] args) {
        MyGeneric<String> myGeneric = new MyGeneric(33, "MyString");
        String str = myGeneric.getT1();// getting the object

        // with two parameters(you can use it with no of parameters you want to use
        // according to your need)

        MyGenericWithTwoParameters<String, Integer> g2 = new MyGenericWithTwoParameters(44, "Str of generic 2", 66);
        String str2 = g2.getT1();
        Integer int2 = g2.getT2();

    }
}
