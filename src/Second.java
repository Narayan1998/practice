

public class Second {
    public static void main(String[] args) {
        int[] ar = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(ar));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int temp = 0;
        //int count = 0;
        for (int j = height.length - 1; j >= 0; j--) {
            int count = 0;
            for(int i = height.length - 2; i >= 0; i--) {
                count++;
                if (height[i] >= height[j]) {
                    temp = height[j] * count;
                } else {
                    temp = height[i] * count;
                }
                if (max < temp) {
                    max = temp;
                }

                System.out.println(max);
            }
        }
        return max;
    }
}
//1,2  = 1
//2,3,4,5,18,17,6  = 17
//1,8,6,2,5,4,8,3,7  = 49
