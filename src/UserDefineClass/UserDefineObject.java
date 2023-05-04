package UserDefineClass;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    String name;
    int roll_no;
    String email;

    Student(String name, int roll_no, String email) {
        this.name = name;
        this.roll_no = roll_no;
        this.email = email;
    }
}

public class UserDefineObject {
    public static void main(String[] args) {
        Student s1 = new Student("Jinal", 101, "abc@gmail.com");
        Student s2 = new Student("Hinal", 102, "dsc@gmail.com");
        Student s3 = new Student("Minal", 103, "asasc@gmail.com");
        //create an ArrayList
        ArrayList<Student> stu = new ArrayList<Student>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        Iterator itr = stu.iterator();
        while (itr.hasNext()) {
            Student str = (Student) itr.next();
            System.out.println(str.roll_no + str.name + str.email);

        }
    }
}
