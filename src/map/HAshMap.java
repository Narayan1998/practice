package map;

import java.util.*;

public class HAshMap {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(5, "na");
        m.put(4, "sa");
        m.put(9, "ka");
        m.put(1, "la");
        m.put(3, "pa");
        //m.put("3", "adas");
        System.out.println(m);


        /*Set<Map.Entry<Integer, String >> s = m.entrySet();
        Iterator<Map.Entry<Integer, String>> it = s.iterator();
        while(it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey()+ " --> "+ entry.getValue());
        }*/
        //System.out.println(m.remove(13));
        for(Map.Entry va : m.entrySet()){

            if(va.getValue().equals("sa"))
                va.setValue("aa");
            //System.out.println(va.getValue());
        }

        Iterator it = m.entrySet().iterator();


        System.out.println(m);
    }
}
