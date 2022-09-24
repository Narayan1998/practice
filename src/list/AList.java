package list;

import java.util.*;

public class AList {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(15);
        String s = "In Java, we need to declare the size of an array before we can use it. Once the size of an array is declared, it's hard to change it.";
        String[] ar = s.split(" ");
        System.out.println(Arrays.toString(ar));
        for(String el : ar){
            l.add(el);
        }
        System.out.println(l);
        System.out.println();
        Iterator<String> i = l.iterator();
        while (i.hasNext()){
            String el = i.next();
            System.out.println(el);
        }

        int[] list2 = {5,6,4};
        LinkedList<Integer> l1 = new LinkedList();
        for(int element : list2){
            l1.add(element);
        }
        System.out.println(l1.removeLast());
    }
}
