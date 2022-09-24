package list;

import java.util.Vector;
import java.util.function.Consumer;

public class VecTor {
    public static void main(String[] args) {
        Vector vector = new Vector(10,3);
//        Integer[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
//        Collections.addAll(vector, arr);

        vector.add("3ssd");
        vector.add(9);
        vector.add(8);
        vector.add('3');
        vector.add(5);
        vector.add(5);
        vector.add(5);
        vector.add(5);
        vector.add(5);
        vector.add(5);
        vector.add(5);
        vector.add(5);
        vector.add(5);
        vector.add(5);
        vector.remove(5);
        //System.out.println(vector.capacity());
        vector.forEach(System.out::println);
    }
}

