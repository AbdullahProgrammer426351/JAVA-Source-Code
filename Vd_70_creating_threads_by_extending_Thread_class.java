
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("My cooking thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Thread 2 chatting is running");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class Vd_70_creating_threads_by_extending_Thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        // For starting thread
        t1.start();
        t2.start();
    }
}
