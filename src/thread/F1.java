package thread;

public class F1 extends Thread{

    public void run(){
        for(int i = 1; i<10; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        F1 f = new F1();
        f.start();

    }
}
