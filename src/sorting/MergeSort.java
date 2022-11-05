package sorting;


import java.util.Arrays;

//time complexity  = O(nLogn) best, average and worst
//axillary space complexity = O(n)
public class MergeSort {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 13, 10, 9, 5, 3, 6, 4, 11, 8};

        mergeSort(ar, 0, ar.length - 1);

        System.out.println(Arrays.toString(ar));
    }

    private static void mergeSort(int[] ar, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(ar, s, mid);
        mergeSort(ar, mid + 1, e);
        conquer(ar, s, mid, e);

    }

    private static void conquer(int[] ar, int s, int mid, int e) {
        int[] merged = new int[e - s + 1];

        int idx1 = s;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= e) {
            if (ar[idx1] <= ar[idx2]) {
                merged[x++] = ar[idx1++];
            } else {
                merged[x++] = ar[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = ar[idx1++];
        }
        while (idx2 <= e) {
            merged[x++] = ar[idx2++];
        }

        for (int i = 0, j = s; i < merged.length; i++, j++) {
            ar[j] = merged[i];
        }
    }

}
