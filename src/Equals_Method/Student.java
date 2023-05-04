package Equals_Method;

public class Student {
    int roll_no;
    String name;
    Student(int roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    public static void main(String[] args) {
        Student s1 = new Student(1,"Hinal");
        Student s2 = new Student(1,"Hinal");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
    }
}
