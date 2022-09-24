package spoj;

import java.util.Scanner;

public class EC_CONB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int reverse = 0;
            int n1 = sc.nextInt();

            if (n1 % 2 == 0) {
                String s = new StringBuilder(Integer.toString(n1, 2)).reverse().toString();
                System.out.println(Integer.parseInt(s, 2));
            } else {
                System.out.println(n1);
            }
        }
    }
}
