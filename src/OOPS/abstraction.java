package OOPS;

public class abstraction {
    public static void main(String[] args) {
        Vehicle v = new Car(); // allowed (reference of abstract class)
        v.start();
        v.fuelType();
    }

}
abstract  class Vehicle {
    abstract void start(); // abstract method (no body)

    void fuelType() {       // normal method
        System.out.println("Petrol or Diesel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}


