package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CRDS {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int total_no = Integer.parseInt(sc.readLine());
        long mod = 1000007;

        for(int i = 1; i<=total_no; i++){
            long n = Integer.parseInt(sc.readLine());
            long ans = ( 3 * n *( n + 1 ) /2 )-n;
            System.out.println(ans%mod);
        }
    }
}
