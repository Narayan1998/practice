package sorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1, 3, 4, 5, 6, 9, 12};
        int s = 0;
        int e = ar.length - 1;

        int n = 11;


        int ans = find(ar, 11, 0, ar.length - 1);
        System.out.println(ans);

        System.out.println(binarySearch(ar, 0, ar.length - 1, 11));


    }

    static int find(int[] ar, int n, int s, int e) {
        if (s <= e) {
            int mid = s + (e - s) / 2;
            if (n > ar[mid]) {
                return find(ar, n, mid + 1, e);
            } else if (n < ar[mid]) {
                return find(ar, n, s, mid - 1);
            } else if (n == ar[mid]) {
                return ar[mid];
            }
            System.out.println("sa");
        }
        return -1;
    }

    static int binarySearch(int[] arr, int l, int r, int x) {
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
        if (r >= l && l <= arr.length - 1) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
