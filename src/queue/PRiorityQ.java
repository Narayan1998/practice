package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PRiorityQ {
    public static void main(String[] args) {

        //customize priority
        Queue<Integer> q = new PriorityQueue<>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return -1;
                }else if(o1<o2){
                    return 1;
                }
                return 0;
            }
        });
        q.offer(5);
        q.offer(4);
        q.offer(9);
        q.offer(6);
        q.offer(8);
        q.offer(5);
        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q.remove());// throw exception if not available
//        System.out.println(q.peek());
//        System.out.println(q.element());// throw exception if not available
//        System.out.println(q);
    }
}
