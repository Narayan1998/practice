package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FCTRL2 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        byte testCases = Byte.parseByte(sc.readLine());
        while (testCases-- > 0) {
            byte input = Byte.parseByte(sc.readLine());
            BigInteger facto = new BigInteger("1");
            for(int i = 1; i<=input;i++){
                facto  = facto.multiply(BigInteger.valueOf(i));
            }
            System.out.println(facto);
        }
    }
}
