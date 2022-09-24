package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IEEEBGAM {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        byte testCases  = Byte.parseByte(sc.readLine());
        float[] memo = new float[1001];
        for(int i = 1; i < 1001; i++)	memo[i] = (i*1.0f)/(i + 1);
        while(testCases-- >0){
            short input  = Short.parseShort(sc.readLine());
            System.out.printf("%.8f",memo[input]);
            System.out.println();
        }
    }
}
