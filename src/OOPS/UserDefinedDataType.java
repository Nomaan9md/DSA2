package OOPS;

import java.util.Scanner;

public class UserDefinedDataType {
    public static class Student{ // khudka ek data type banaliya hai
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }

    }
    public static class Car{ // khudka ek data type banaliya hai
        String name;
        int seat;
        double length;
        void print(){
            System.out.println(name+" "+seat+" "+length);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Khushi";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;

        Student s3 = new Student();
        s3.name = "Anagha";
        s3.rno =   13;  //sc.nextInt();
        s3.cgpa = 9.2;

        //System.out.println(s1.name);
        //s1.print();s2.print();s3.print(); this we are printing we the help of class in built methode//
        // print(s1);print(s2);print(s3); this methode we are printing by making seoerate methode for print

        Car c1 = new Car();
        c1.name = "BMW";
        c1.seat = 5;
        c1.length = 4.5;
        // c1.print();
        change(c1);
        System.out.println(c1.seat);
    }
    // pass by reference this is not deep copy;
    private static void change(Car x){
        x.seat = 4;
    }
    // print methode to print student elements
    public static void print(Student s){
        System.out.println(s.name+" "+ s.rno+" "+s.cgpa);
    }

}
