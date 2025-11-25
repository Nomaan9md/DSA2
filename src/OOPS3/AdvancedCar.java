package OOPS3;



public class AdvancedCar extends Car {

    public int gpsNavigation;

    AdvancedCar(int noOfWheel, String SteeringWheel, int seats, int gpsNavigation){
        super(noOfWheel, SteeringWheel, seats); // is going to call the constructor which is define in car class;
    }

    void StartAdvcanceCar(){
        System.out.println("Car Advance Started");
    }

    public void startCar(){
        System.out.println("Start Advance Car with gps Navigation ");
    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void breake() {

    }

    @Override
    public void funny() {

    }
}