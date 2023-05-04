package TreeMap_Class;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Practice {
    public static void main(String[] args) {
        TreeMap <Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(101,"jiva");
        tm.put(201,"kashhish");
        tm.put(199,"lavish");
        tm.put(100,"kavish");

        System.out.println(tm);

        TreeMap <Integer,String> tm2 = new TreeMap<Integer,String>();
        tm2.putAll(tm);
        System.out.println(tm2);

        //Access Element
        System.out.println(tm.entrySet());
        System.out.println(tm.keySet());
        System.out.println(tm.values());
        System.out.println(tm.get(201));
        System.out.println(tm.getOrDefault(200,"kiva"));

        //traverse
        for (Map.Entry i:tm.entrySet()) {
            System.out.println(i.getKey()+ "  "+i.getValue());
        }

        //Remove Element
        System.out.println(tm2.remove(101));
        System.out.println(tm2);
        System.out.println(tm2.remove(100,"kavish"));
        System.out.println(tm2);

        System.out.println(tm2.replace(199,"Priyanshi"));
        System.out.println(tm2);

        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());

        System.out.println("return the higher key with the specified key "+tm.higherKey(100));
        System.out.println(tm.higherEntry(108));
        System.out.println(tm.ceilingKey(103));
        System.out.println(tm.ceilingEntry(105));
        System.out.println(tm.floorEntry(103));
        System.out.println(tm.floorKey(108));

        System.out.println(tm.headMap(103));
        System.out.println(tm.tailMap(103));

        System.out.println(tm.subMap(101,201));


    }
}
