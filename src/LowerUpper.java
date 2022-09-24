import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LowerUpper {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ele = "1 12 2 5 7 4".split(" ");

        TreeSet<Integer> set = new TreeSet<>();
        for (String s : ele) {
            set.add(Integer.parseInt(s));
        }


        int sum = 0;
        for (int i = 0; i < ele.length; i++) {
            int temp = 0;
            if (set.size() != 1) {
                try {
                    temp = set.pollLast();
                    temp = temp + set.pollLast();
                } catch (NullPointerException e) {
                    System.out.println(e);
                }
                set.add(temp);
                sum = sum + temp;

            } else {
                System.out.println(sum);
            }
        }


        Queue<Integer> priorityQueue = new PriorityQueue<>(4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return +1;
                } else {
                    return 0;
                }
            }
        });
        for (String s : ele) {
            priorityQueue.add(Integer.parseInt(s));
        }


//        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.poll());


        sum = 0;
//        while(priorityQueue.size()>1){
//            int min = priorityQueue.poll();
//            int secMin = priorityQueue.poll();
//
//            sum = sum + (-min)+(-secMin);
//
//            priorityQueue.add(-((-min)+(-secMin)));
//
//        }
        System.out.println(sum);
        int n = 6;
        for(int row = 0; row<=n;row++){
            for(int col = 0; col<=n; col++){
                int num = n -2- Math.min(Math.min(row,col), Math.min(n-col, n-row));
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}


//  Time complexity: O(nlogn)