package OOPS;
import java.util.Arrays;
// how Constructor works
public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;

        //in this constructor1 is we initialise size of an array with help of constructor
        StudentData(int s){
            marks = new int[s]; // deep copy we
        }

        //this constructor2 is about how to create shallow copy
//      StudentData(int[] s){
//            marks = s; //shallow copy
//      }
        // this constructor3 is about how to create deep copy
        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length); //shallow copy
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,7,1,4,8}; // int[] brr = arr; // brr can everything from arr this is shallow copy
        StudentData s1 = new StudentData(arr);
        s1.marks[0] = 40; // we created shallow copy
        System.out.println(arr[0]); // output 40 shallow copy if call constructor2 and output 4 if we called constructor 3

        StudentData s2 = new StudentData(6); // constructor 1;
//        s1.marks[0] = 89;
//        s1.marks[1] = 91;
    }
}

