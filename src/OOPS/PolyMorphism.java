package OOPS;

public class PolyMorphism {
    public static class dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class cat{
        void speak(){
            System.out.println("Mewo Mewo");
        }
    }
    public static class lion{
        void speak(){
            System.out.println("Grrrrrr");
        }
    }

    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }

   public static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
        int add(int a,int b, int c){
            return a+b+c;
        }
    }

    public static void main(String[] args){
        dog tommy = new dog();
        cat c = new cat();
        lion l = new lion();
        Pikachu p = new Pikachu();
        Human saad = new Human();

        tommy.speak();
        c.speak();
        l.speak();
        p.speak();
        saad.speak();


        Calculator calc1 = new Calculator();
        calc1.add(22,3);
        calc1.add(2.3,5.8);

        System.out.println(calc1.add(2,3,4));
    }
}
