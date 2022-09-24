package exceptions;

public class First {

     private static int data = 20;
    final static private int x = 7;

    static class Second{
        void msg(){
            System.out.println(data + " " +x);
        }
    }
    public static void main(String[] args){
        First.Second f = new First.Second();

        f.msg();
        System.out.println(data);
    }
}
abstract class Student{
    abstract void name();
}



