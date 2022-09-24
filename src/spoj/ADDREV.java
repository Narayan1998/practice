package spoj;

import java.util.Scanner;

public class ADDREV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int reverse = 0;
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            while (n1 != 0) {
                int remainder = n1 % 10;
                reverse = reverse * 10 + remainder;
                n1 = n1 / 10;
            }
            n1 = reverse;
            reverse = 0;
            while (n2 != 0) {
                int remainder = n2 % 10;
                reverse = reverse * 10 + remainder;
                n2 = n2 / 10;
            }
            n2 = reverse;

            int sum = n1 + n2;
            reverse = 0;
            while (sum != 0) {
                int remainder = sum % 10;
                reverse = reverse * 10 + remainder;
                sum /= 10;
            }
            sum = reverse;
            System.out.println(sum);
        }
    }
}
