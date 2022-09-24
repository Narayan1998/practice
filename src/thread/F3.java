package thread;

public class F3 extends Thread {

    public void run() {
        System.out.println("thread " + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        F3 f1 = new F3();
        F3 f2 = new F3();
        f1.setDaemon(true);
        f1.start();

        f2.start();
    }
}
