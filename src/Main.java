
import java.util.*;
 class Main {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        ArrayList <Integer> col = new ArrayList<>();
        col.add(12);
        col.add(23);
        col.add(29);
        System.out.println(col);
        System.out.println(list);

//         Convert Integer collection into String Collection
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            list.add(String.valueOf(itr.next()));
        }
        System.out.println(list);

    }
    }

                // Creating an empty ArrayList
//                Collection<Integer>
//                        list = new ArrayList<String>();

                // A collection is created
//                Collection<String> collect = new ArrayList<>();
//                collect.add("hinal");
//                collect.add("jain");
//                collect.add("jaya");
//
//        System.out.println(collect);
//                // Displaying the list
//                System.out.println("The ArrayList of STring: " + list);
//
//                Iterator  itr =  collect.iterator();
//                while (itr.hasNext())
//                {
//                    list.add(String.valueOf(itr.next()));
//                }
//             System.out.println("The ArrayList of String type is :" +list);
//                list.removeAll(collect);
//        System.out.println(list);
//            }





