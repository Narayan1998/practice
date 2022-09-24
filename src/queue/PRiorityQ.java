package queue;

import java.util.PriorityQueue;

public class PRiorityQ {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add(5);
        p.add(4);
        p.add(1);
        p.add(3);
        System.out.println(p);
        System.out.println(p.poll());
    }
}
