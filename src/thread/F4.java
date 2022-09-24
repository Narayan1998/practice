package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable {
String name;

    Tasks(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Thread --> "+name+" " + Thread.currentThread().getName());
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}

public class F4 {
    public static void main(String[] args) {
        Runnable r1 = new Tasks("1");
        Runnable r2 = new Tasks("2");
        Runnable r3 = new Tasks("3");

        ExecutorService e = Executors.newFixedThreadPool(3);
        e.execute(r1);
        e.execute(r2);
        e.execute(r3);

        e.shutdown();
    }
}
