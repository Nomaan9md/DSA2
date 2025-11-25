package OOPS3;

/// this is for inheritance and super keywords
public abstract class Car implements VehicleBehaviour,VehicleBehaviour2 {
    private int noOfWheel;

    private String SteeringWheel;

    private int seats;

    public Car(int noOfWheel, String SteeringWheel, int seats) {
        this.noOfWheel = noOfWheel;
        this.SteeringWheel = SteeringWheel;
        this.seats = seats;

    }

    public int getNoOfWheel() {
        return noOfWheel;
    }

    public void setNoOfWheel(int noOfWheel) {
        this.noOfWheel = noOfWheel;
    }

    public abstract void startCar();

    ///  same methode with same name but differnt parameters this is called Methode Overloading
    public void startCar(int acceleration){
        System.out.println("Car Started  with acceleration " + acceleration);
    }
}