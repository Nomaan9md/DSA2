package aggregation;

public class Car {
    private String model;

    private Engine engine;

    Car(String model,Engine engine){
        this.model = model;
        this.engine = engine;
    }

    public void showCar(){
        System.out.println("Car Model : " + model);
        engine.ShowEngine();
    }


}
