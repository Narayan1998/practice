import java.lang.reflect.Array;
import java.util.Arrays;

public class X {

    public static void main(String[] args) {
        int[] ar = {3,6,1,8,10,5};

        System.out.println(Arrays.toString(ar));
        //bubbleSort(ar);
        //selectionSort(ar);
        quickSort(ar, 0, ar.length-1);
        System.out.println(Arrays.toString(ar));

    }

    private static void quickSort(int[] ar, int low, int high) {
        if(low<high){
            int pivotIndex = partion(ar, low, high);
            quickSort(ar, low, pivotIndex-1);
            quickSort(ar, pivotIndex+1, high);
        }
    }

    private static int partion(int[] ar, int low, int high) {

        int pivot = ar[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            if(ar[j]<pivot){
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        i++;
        int temp = ar[i];
        ar[i] = ar[high];
        ar[high] = temp;

        return i;
    }

    private static void selectionSort(int[] ar) {
        int n = ar.length;
        for(int i = 0; i<n; i++){
            int smallestIndex = i;
            for(int j = i+1; j<n; j++){
                if(ar[smallestIndex]>ar[j]){
                    smallestIndex = j;
                }
            }
            int temp = ar[smallestIndex];
            ar[smallestIndex] = ar[i];
            ar[i] = temp;
        }
    }

    private static void bubbleSort(int[] ar) {
        int n = ar.length;
        for(int i = 0; i<n; i++){
            for(int j = 1; j<n-i; j++){
                if(ar[j-1]>ar[j]){
                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
}