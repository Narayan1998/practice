package set;

import java.util.ArrayList;
import java.util.EnumSet;

public class ENum {

    enum days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        EnumSet<days> s = EnumSet.allOf(days.class);

        ArrayList<days> l = new ArrayList();


        s.addAll(l);

        System.out.println(s);
    }
}
