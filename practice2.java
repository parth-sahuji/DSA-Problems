// package OOPS;

public class practice2 {
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Student s1 = new Student();
        Student s2 = new Student("Chaman");
        Student s3 = new Student(69);

        // s1.name="chaman";
        // System.out.println(s1.name);
    }
}


class Student {
    String name ;
    int roll;


    Student() {
        System.out.println("Radhe Radhe");
    }
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}