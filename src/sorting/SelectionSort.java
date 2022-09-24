package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ar = {3, 6, 1, 4, 9, 12, 5};

        System.out.println(Arrays.toString(sort(ar)));
    }

    static int[] sort(int[] ar){
        for (int i = 0; i < ar.length-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[smallest]) {
                    smallest = j;
                }
            }
            ar[i] = ar[i]+ar[smallest];
            ar[smallest] = ar[i]-ar[smallest];
            ar[i] = ar[i]-ar[smallest];
        }
        return ar;
    }
}
