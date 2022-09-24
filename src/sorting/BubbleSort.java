package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {3,6,1,4,9,12,5};
        System.out.println(Arrays.toString(sort(ar)));
    }
    static int[] sort(int[] ar){
        for(int i = 0; i<ar.length; i++){
            for(int j = 1; j<ar.length-i;j++){
                if(ar[j-1]>ar[j]){
                    ar[j-1] = ar[j-1]+ar[j];    //ar[j-1]^ar[j];
                    ar[j] = ar[j-1]-ar[j];      //ar[j-1]^ar[j];
                    ar[j-1] = ar[j-1]-ar[j];    //ar[j-1]^ar[j];
                }
            }
        }
        return ar;
    }
}
