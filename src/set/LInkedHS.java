package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LInkedHS {
    public static void main(String[] args) {
        LinkedHashSet l = new LinkedHashSet();
        l.add("d");
        l.add(3);
        l.add('5');
        l.add("3");
        l.add(null);
        l.add(null);
//        System.out.println(l.contains());
        System.out.println(l);
        Iterator it = l.iterator();
        while(it.hasNext()) {
            Object i = it.next();
            System.out.println(i);
        }

    }
}
