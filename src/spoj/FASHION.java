package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FASHION {
    public static void main(String[] args) throws IOException
    {

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(b.readLine());

        int sum = 0;
        while(testCases-- > 0){
            int input = Integer.parseInt(b.readLine());
            int[] ar1 = new int[input];
            int[] ar2 = new int[input];
            String[] ars1 = b.readLine().split(" ");
            String[] ars2 = b.readLine().split(" ");
            for(int i = 0; i<input;i++){
                ar1[i] = Integer.parseInt(ars1[i]);
            }
            for(int i = 0; i<input;i++){
                ar2[i] = Integer.parseInt(ars2[i]);
            }
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            for(int i = 0; i<input;i++){
                sum += ar1[i] * ar2[i];
            }
            System.out.println(sum);


        }
    }
}
