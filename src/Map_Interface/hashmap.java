package Map_Interface;

import java.util.Collection;
import java.util.*;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<Integer,String>();
        Map<Integer,String> map2=new HashMap<Integer,String>();
        //put all key value in map
        map1.put(101,"Hinal");
        map1.put(102,"jiva");
        map1.put(103,"kishore");
//        map1.put(102,"kashish");
//        map1.replaceAll((k,v)->"Ajay");
        System.out.println(map1);

        //putall method is used to put all the specified collectiohn inside the map2 interdace
        map2.putAll(map1);
        System.out.println(map2);


        //return the value by specified the key
        System.out.println(map2.get(102));

        map2.remove(102);
        System.out.println(map2);

        //containKeys
        System.out.println(map1.containsKey(102));

        //containValue
        System.out.println(map2.containsValue("Hinal"));

        //isEMpty
        System.out.println(map2.isEmpty());

        //size of the map
        System.out.println(map2.size());

        //clear the map2
        map2.clear();
        System.out.println(map2);

        map2.putAll(map1);
        System.out.println(map2);
        //use of keyset it returns the key in the form of set
        System.out.println(map2.keySet());

        //use of values it return the value in the form of collection
        System.out.println(map2.values());

        //use of entryset it return all the entries in the hashmap it return type also set
        System.out.println("Return key and value by using empty set" +map2.entrySet());


        // four method to read individual keys
        //1)for loop by using keyset it return only keys
        System.out.println("\nRead individual key in hashmap");
        for(int i : map1.keySet()){
            System.out.println(i);
        }

        //2)using keyset it return key as wel as values also
        System.out.println("\n Read keys as well as values in hashmap");
        for (int i :map1.keySet()){
            System.out.println(i + "     " +map1.get(i));
        }

        //3)using Entry method with for each loop
        System.out.println("\nRead keys as well as values in hashmap by using Entry method");
        for (Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey() + "    " +m1.getValue());
        }

        //iterator method
        Set s = map1.entrySet(); //Converting to Set so that we can traverse
        Iterator itr = s.iterator();
        while (itr.hasNext()){  //Converting to Map.Entry so that we can get key and value separately
            Map.Entry e1 = (Map.Entry)itr.next();
            System.out.println(e1.getKey() + "  "+e1.getValue());
        }





    }
}
