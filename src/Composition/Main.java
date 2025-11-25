package Composition;

/*
Why is This Composition?

----> The Engine object is created inside the Car class.

----> Without a Car object, there is no engine object.

----> The engine's lifecycle is tied to the car's lifecycle.
* */

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
