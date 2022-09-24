package list;

import java.util.*;

public class STack {
    public static void main(String[] args) {
        Stack s = new Stack();
//        s.push(5);
//        s.push(3);
//        s.push(9);
//        s.push(4);
//        s.push(58);


        //System.out.println(s.push(1));


        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search(9));
        try {
            System.out.println(s.pop());
            System.out.println(s.empty());
        }catch (EmptyStackException e){
            System.out.println(e);
        }


        System.out.println(s.search(9));

    }
}
