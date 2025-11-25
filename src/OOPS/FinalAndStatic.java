package OOPS;
class Cricketer{
    static String country = "NZ";
    int runs;
    String Name;
    double avg;
    void print(){
        System.out.println(runs+" "+Name+" "+avg);
    }
    static void greet(){
        System.out.println("I only believe in Jassi Bhai");
    }
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        //c1.country = "England";
        Cricketer c2 = new Cricketer();
        c1.runs = 28;
        c1.Name = "Siraz";
        c1.avg = 12.5;
        c1.country = "India";
        // System.out.println(c2.country);
        // c1.print();
        // c1.greet();
        Cricketer.greet();
        System.out.println(Cricketer.country);
    }
}
