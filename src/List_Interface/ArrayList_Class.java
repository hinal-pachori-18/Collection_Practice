package List_Interface;

import java.util.*;

public class ArrayList_Class {


    //Declare ArrayList with any type of data means hetrogeneous
//    ArrayList a1 = new ArrayList();
    //List l1 = new ArrayList();
    //Declare ArrayList with any type of data means homogenoust and INterger is wrapper class
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        ArrayList a2 = new ArrayList();
        a1.add("Hinal");
        a1.add(23);
        a1.add(true);
        a1.add("king");
        a1.add("Hinal");

        //Add all the element of a1 will store on a2
        a2.addAll(a1);
        System.out.println("Array list 2 : "+a2);
        System.out.println(a1);
        //add particular element in the middle of array
        a1.add(2,"pachori");
        System.out.println(a1);
        //size
        System.out.println(a1.size());
        //remove an element
        a1.remove(2);
        System.out.println(a1);
        //retrrive specific element
        System.out.println(a1.get(0));
       //change element/replace
        a1.set(0,"Heena");
        System.out.println(a1);
        System.out.println(a1.contains("Heena"));

        System.out.println(a1);
        //Collections.sort(a1);
        //System.out.println("AFTER SORTING AN ELEMENT :" +a1); ;
        //
        //read data from arraylist
        //1)for loop
        System.out.println("Reading element using for loop");

        for (int i = 0;i<a1.size();i++)
        {
            System.out.println(a1.get(i));
        }

        System.out.println("Reading element using for each loop");
        //2)for each loop

        for (Object e : a1)
            System.out.println(e);



        //3)iterator method is used to read each and every element from arraylist and stor in particular variable.
        //hasNext method return true if the iterator having an element otherwise false.
        //next method return an element and move to the next element
        System.out.println("Reading element using iterator");
        Iterator it = a1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        //COnverting Arrays into ArrayList
        String arr[] = {"Dog","Cat","Lion"};
        ArrayList a3 = new ArrayList(Arrays.asList(arr));
        System.out.println("COnverting array into ArrayList" +a3);
    }



}
