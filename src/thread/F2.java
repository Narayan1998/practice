package thread;

public class F2 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Runnable f = new F2();
        Thread t = new Thread(f, "one");
        t.setPriority(1);
        Thread t2 = new Thread(f, "two");
        t2.setPriority(8);
        t.start();
        //t.join();
        t2.start();
        //t2.join();
        System.out.println(t2.getPriority()+"+"+t.getPriority());

    }

    @Override
    public void run() {
        for(int i=1;i<10;i++) {
            System.out.println("thread " + i + " " + Thread.currentThread().getName());
        }

    }
}
