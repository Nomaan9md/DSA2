package OOPS2;

public class LuxuryCar extends car{
    public int ExtraLegSpace;
    public String Sunroof;

    LuxuryCar(int noOfWheel, String SteeringWheel, int seats, int ExtraLegSpace, String Sunroof){
        super(noOfWheel, SteeringWheel, seats);
        this.ExtraLegSpace = ExtraLegSpace;
        this.Sunroof = Sunroof;
    }

    public void startCar(){
        System.out.println("Luxury car is started sunroof opens in 4s ");
    }
}
