package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//6
//        3
//        60
//        100
//        1024
//        23456
//        8735373

public class FCTRL {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(sc.readLine());
        while (testCases-- > 0) {
            int number = Integer.parseInt(sc.readLine());
            int count = 0;
            byte power = 1;
            while (Math.pow(5, power) <= number) {
                count += number / Math.pow(5, power++);
            }
            System.out.println(count);
        }
    }
}
