package set;


import java.util.HashSet;

public class HAshset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        int n = 10;
        while(n-->1){
            hs.add(n);
        }
        System.out.println(hs);


    }
}

