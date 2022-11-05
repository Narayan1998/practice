package logic;

public class Prime {

    static Boolean check(int number) {
        int i, m = 0, flag = 0;
        m = number / 2;

        //Returning false when the number is either 0 or 1 because 0 and 1 cannot be prime numbers
        if (number == 0 || number == 1) {
            return false;
        } else {
            //When the number is not 0 and 1
            for (i = 2; i <= m / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }//end of else
    }

    private static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    static Boolean checking(int n) {


        //Returning false when the number is either 0 or 1 because 0 and 1 cannot be prime numbers
        if (n <= 1) {
            return false;
        } else {
            //When the number is not 0 and 1
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }//end of else
    }

    public static void main(String args[]) {
        //for(int i=0; i<=50; i++){
        System.out.println(check(21));
        //{
        //  System.out.println(i+" is a Prime number");
        //}
        //}
    }
}
