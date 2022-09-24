package logic;

public class Fibbo {
static int count = 0;
    static int num1 = 0, num2 = 1, num3 = 0;

    public static void main(String[] args) {
        int n = 10;
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2);
        while (n > 0) {
            int temp = n1 + n2;
            System.out.print(" " + temp);
            n1 = n2;
            n2 = temp;
            n--;
        }
        System.out.println();

        int te = 5;
        System.out.print(num1 + " " + num2);
        fibb(te-2);

        System.out.println();
        System.out.println(fibbSum(te));
    }

    static void fibb(int n) {
        if (n > 0) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
            fibb(--n);
        }
    }

    static int fibbSum(int n) {
        if (n < 2) {
            return n;
        }
        System.out.println(++count);
        return fibbSum(n - 1) + fibbSum(n - 2);
    }
}
