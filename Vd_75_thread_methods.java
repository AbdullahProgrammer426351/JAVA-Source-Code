
class MyNewThr1 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Thank you thread 1 " + this.getName());
            i++;
        }
    }
}

class MyNewThr2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Thank you thread 2 " + this.getName());
            i++;
        }
    }
}

public class Vd_75_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        // if we want that t2 should not start utill t1 gets complete, we can do this by
        // following code
        try {
            t1.join();// it will give exception that it is possible that when this line will be
                      // executed, the thread may be killed... therefore, we have to write this code
                      // in try catch block
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}
