package Map_Interface;

import java.util.*;

class Book_details {
     int b_id;
     String b_name,b_author;
     int b_price;

 Book_details(int b_id,String b_name,String b_author,int b_price){
     this.b_id = b_id;
     this.b_name = b_name;
     this.b_author = b_author;
     this.b_price = b_price;
 }

}
public class Book
{
    public static void main(String[] args) {
        //create a map interface of book class
        HashMap <Integer,Book_details> b = new HashMap<Integer,Book_details>();
        Book_details b1 = new Book_details(101,"C","jijiji",1000);
        Book_details b2 = new Book_details(101,"java","kkkkk",2000);
        Book_details b3 = new Book_details(101,"c++","jdsfsdji",3000);

        b.put(1,b1);
        b.put(2,b2);
        b.put(3,b3);

        Set<Map.Entry<Integer, Book_details>> s = b.entrySet();

        Iterator iterator = s.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Book_details> entry  = (Map.Entry<Integer, Book_details>) iterator.next();
            System.out.println("Keys : " + entry.getKey() + "Values "+ "id :"+entry.getValue().b_id);
        }

      /*  Set s = b.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()){
            Map.Entry e1 = (Map.Entry)itr.next();

            Map.Entry bd = e1.getValue();
            System.out.println(e1.getKey() + "" +bd);*/







    }
}