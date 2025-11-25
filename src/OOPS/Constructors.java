package OOPS;

public class Constructors {
    public static class Car{
        int price; // 0
        String name; // null

        Car(){ // default constructor

        }
//      Car(int x, String s){
//             price = x;
//             name = s;
//        }
//        Car(int price, String name){ // if we call this constructor it will return o and null values
//              price = price;
//              name = name;
//        }

        Car(int price, String name){
            this.price = price;
            this.name = name;
        }

        Car( String s,int x){
            price = x;
            name = s;
        }

        void print(){
            int price = 12;
           // System.out.println(name+" "+price+" "); // output price = 12
            System.out.println(name+" "+this.price+" "); // output price = 12500000 , 400000
        }

    }

    public static void main(String[] args) {
        Car c1 = new Car(1250000,"Kia Sonet");
        c1.print();
        Car c2 = new Car("Lord Alto",400000); // order matter karta hai function ke under
        c2.print();
       // Car c3 = new Car(); // throw error because default constructor ia absent and we created parameterised constructor
    }
}

