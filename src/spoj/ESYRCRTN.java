package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ESYRCRTN {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(b.readLine());
        int[] ar = {1,4,6,5,2,0};

        while (testcases-- >0){
            long input = Long.parseLong(b.readLine())-1;
            int val = (int)(input%6);
            System.out.println(ar[val]);
        }

    }
}
