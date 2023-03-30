class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thank you " + this.getName());
    }
}

public class Vd_74_thread_peririties {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("name1");
        MyThr1 t2 = new MyThr1("name2");
        MyThr1 t3 = new MyThr1("name3");
        MyThr1 t4 = new MyThr1("name4");
        MyThr1 t5 = new MyThr1("name5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
