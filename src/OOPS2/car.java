package OOPS2;
/// this is for inheritance and super keywords
public class car {
    private int noOfWheel;

    private String SteeringWheel;

    private int seats;

    public car(int noOfWheel, String SteeringWheel, int seats) {
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

    public void startCar(){
        System.out.println("Car Started");
    }

    ///  same methode with same name but differnt parameters this is called Methode Overloading
    public void startCar(int acceleration){
        System.out.println("Car Started  with acceleration " + acceleration);
    }
}
