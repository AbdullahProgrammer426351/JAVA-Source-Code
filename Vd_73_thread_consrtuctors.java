
class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 33) {
            System.out.println("I am a thread");
            i++;
        }
    }
}

public class Vd_73_thread_consrtuctors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Abdullah");
        t1.start();
        t2.start();
        // to print the id of thread
        System.out.println("Id of thread is : " + t1.getId());
        System.out.println("Id of thread is : " + t2.getId());
        // to print the name of thread
        System.out.println("Name of thread is : " + t1.getName());
        System.out.println("Name of thread is : " + t2.getName());
    }
}
