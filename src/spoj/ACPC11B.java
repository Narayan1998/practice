package spoj;

import java.io.IOException;
import java.util.Scanner;

public class ACPC11B {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();

        for (int i = 1; i <= test_case; i++) {

            int no_elements1 = sc.nextInt();
            long[] ar1 = new long[no_elements1];
            for (int j = 0; j < no_elements1; j++) {
                ar1[i] = sc.nextLong();
            }

            int no_elements2 = sc.nextInt();
            long[] ar2 = new long[no_elements2];
            for (int j = 0; j < no_elements2; j++) {
                ar2[i] =  sc.nextLong();  
            }
//            long[] ar1 = {2, 3, 5, 10, 9, 3, 2, 1};
//            long[] ar2 = {1, 2, 6, 12, 13, 3 ,2};
            long diff = 0;
            long temp = 0;
            for (int k = 0; k < ar1.length; k++) {
                for (int l = 1; l < ar1.length; l++) {
                    if (ar1[k] < ar1[l])
                    {
                        temp = ar1[k];
                        ar1[k] = ar1[l];
                        ar1[l] = temp;
                    }
                }
            }
            diff = temp;
            for (int k = 0; k < ar2.length; k++) {
                for (int l = 1; l < ar2.length; l++) {
                    if (ar2[k] < ar2[l])
                    {
                        temp = ar2[k];
                        ar2[k] = ar2[l];
                        ar2[l] = temp;
                    }
                }
            }
            System.out.println(Math.abs(diff-temp));
        }
    }
}
