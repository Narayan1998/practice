package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ARMY {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(b.readLine());
        b.readLine();

        while (testCases-- > 0) {
            String[] s = b.readLine().split(" ");
            int n1 = Integer.parseInt(s[0]), n2 = Integer.parseInt(s[1]);

            s = b.readLine().split(" ");
            long max1 = 0;
            for (int i = 0; i < n1; i++){
                max1 = max1 > Integer.parseInt(s[i]) ? max1 : Integer.parseInt(s[i]);
            }

            s = b.readLine().split(" ");
            long max2 = 0;
            for (int i = 0; i < n2; i++){
                max2 = max2 > Integer.parseInt(s[i]) ? max2 : Integer.parseInt(s[i]);
            }

            b.readLine();

            if (max1 >= max2) {
                System.out.println("Godzilla");

            } else {
                System.out.println("MechaGodzilla");
            }
        }
    }
}
