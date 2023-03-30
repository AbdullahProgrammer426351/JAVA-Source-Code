
class MyThreadRunnable1 implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i = 0;
        while (i < 3000) {
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }

    }

}

class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i = 0;
        while (i < 3000) {
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }

}

public class Vd_71_creating_threads_by_implementing_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        // starting threads
        gun1.start();
        gun2.start();
    }
}
