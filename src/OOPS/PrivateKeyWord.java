package OOPS;
class Students{
    String name;
    private int rno = 33;
    double cgpa;
    public void print(){ //getter
        System.out.println(name+" "+rno+" "+cgpa);
    }
    int getRno(){ //getter
        return rno;
    }
    void setRno(int x){ //setter
        rno = x;
    }
//    public void p(){  // we will used this when we have private void method line no 6
//        print();
//    }

}
public class PrivateKeyWord {
    public static void main(String[] args) {
        Students s1 = new Students();
       // s1.print();
        s1.cgpa=8.0;
        s1.name="Sam";
       // s1.rno = 45;// error
        s1.setRno(45);
        System.out.println(s1.getRno());

    }
}

