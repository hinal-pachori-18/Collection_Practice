package HashSet_Class;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Class {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        hs.add("21");
        hs.add("11");
        hs.add("33");
        hs.add("3");

        System.out.println(hs);
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            hs1.add(Integer.valueOf(itr.next().toString()));
        }
        System.out.println(hs1);

    }
}
