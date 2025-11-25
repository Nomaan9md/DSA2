package OOPS2;

public class Main {
    public static void main(String[] args) {
        // “Programming to an Interface rather than a Concrete Implementation” — one of the most important OOP principles.
        car advanceCar = new AdvancedCar(3, "Automatic", 4,4);
        car luxuryCar  = new LuxuryCar(4, "Manual", 4,4, "yes");
        car car1 = new car(4,"yes", 7);


        advanceCar.startCar();  // run time polymorphism  which car to start() executes is decided at runtime
        luxuryCar.startCar();  // run time polymorphism
        car1.startCar();      // run time polymorphism
        advanceCar.startCar(10);


//        car ad = new AdvancedCar(3, "Automatic", 4,4);
//        ad.StartAdvcanceCar(); //
    }

}
