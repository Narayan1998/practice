package logic;

public class Reverse {
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;
        while (n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);

        System.out.println(reve(1234));
    }
    static int rev = 0;
    static int reve(int n){
        if(n==0){
            return rev;
        }
        int rem = n%10;
        rev = rev*10+rem;
        return reve(n/10);
    }
}
