package OOPS;
//class Pokemon{
//    //        int hp;
////        int speed;
////        int attack;
////        int defence;
////        String name;
//    private int power; // 0
//    String type; // null
//    //        Pokemon(String t, int p){
////            power = power;
////            type = type;
////        }
//    Pokemon(String type, int power ){
//        this.power = power;
//        this.type = type;
//    }
//    int getPower(){
//        return power;
//    }
//    void print(){ // act  getter
//        System.out.println(this.power+" "+this.type);
//    }
//}
public class RevisionOOPS {

    public static void main(String[] args) {
//       how to create a shallow copy
//        Pokemon p1 = new Pokemon();
//        p1.name = "Pikachu"; p1.type ="Electric"; p1.attack = 70;
//        Pokemon p2 = new Pokemon();
//        p2.name = "Charizard"; p2.type="Fire"; p2.attack=110;
//        Pokemon p3 = p1; //p3 is shallow Copy of p1 (p3 can control p1)
//        p3.type = "water";
//        System.out.println(p1.type); //output will be Water.

          Pokemon p1 = new Pokemon("Electric", 70);
          p1.type  = "fire";
          // p1.power = 34;// Error reason for error is the class we made is outside the main calss so we cannot acesses private variable outside that class
         // p1.print();
          Pokemon pikachu = new Pokemon("Electric", 70);
          pikachu.type = "Fire";
          System.out.println(pikachu.getPower());
          Pokemon jigglepuff = new Pokemon("Fairy", 50);
          pikachu.print(); jigglepuff.print();



    }
}
