package Composition;

public class Car {

    private Engine engine;  // Composition: Car owns Engine

    public Car() {
        // Car creates and controls engine
        engine = new Engine("V8");
    }

    public void startCar() {
        engine.start();
        System.out.println("Car is running...");
    }
}
