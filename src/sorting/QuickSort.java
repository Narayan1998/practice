package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ar = {6,3,9,5,2,10,1,0,13,19,14};
        int n = ar.length;
        quickSor(ar, 0, n-1);

        System.out.println(Arrays.toString(ar));

    }

    static void quickSor(int[] ar, int low, int high){
        if(low<high){
            int pivotIndex = partition(ar, low, high);
            quickSor(ar, low, pivotIndex-1);
            quickSor(ar, pivotIndex+1, high);

        }
    }

    private static int partition(int[] ar, int low, int high) {
        int pivot = ar[high];
        int i = low-1;

        for(int j = low; j<high; j++) {
            if(ar[j] < pivot){
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        i++;
        int temp = ar[i];
        ar[i] = pivot;
        ar[high] = temp;
        return i;

    }
}
//time coomplexity = best = O(nlogn)
// when arrays are sorted = worst = O(n2)