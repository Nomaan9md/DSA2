package OOPS2;

public class AdvancedCar extends car{

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


}
