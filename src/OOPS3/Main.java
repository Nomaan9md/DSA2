package OOPS3;


public class Main {
    public static void main(String[] args) {
        // “Programming to an Interface rather than a Concrete Implementation” — one of the most important OOP principles.
        Car advanceCar = new AdvancedCar(3, "Automatic", 4,4);
        Car luxuryCar  = new LuxuryCar(4, "Yes", 4, "Yes");

        ///  Car car1 = new Car(4,"yes", 7); we cannot instantiate abstract class object


        advanceCar.startCar();  // run time polymorphism  which car to start() executes is decided at runtime
        luxuryCar.startCar();  // run time polymorphism
        advanceCar.startCar(10);


//        car ad = new AdvancedCar(3, "Automatic", 4,4);
//        ad.StartAdvcanceCar(); //
    }

}
