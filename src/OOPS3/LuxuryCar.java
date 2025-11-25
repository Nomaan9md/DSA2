package OOPS3;


public  class LuxuryCar extends Car {

    private String airCondition;

    LuxuryCar(int noOfWheel, String SteeringWheel, int seats, String airCondition){
        super(noOfWheel, SteeringWheel, seats);
        this.airCondition= airCondition;
    }

    ///  if we comment this out we will get error which says u must either be declared abstract or implement abstract method 'startCar()' in 'Car'
    @Override
    public void startCar(){
        System.out.println("Luxury car is started sunroof opens in 4s ");
    }


    @Override
    public void start() {
        System.out.println("Luxury car is started sunroof opens in 4s ");
    }

    @Override
    public void stop() {
        System.out.println("Luxury car is Stop in 4s ");
    }

    @Override
    public void accelerate() {
        System.out.println("Luxury car is accelerate at 4m/s ");
    }

    @Override
    public void breake() {
        System.out.println("Luxury car  break");
    }

    @Override
    public void funny() {
        System.out.println("Luxury car  funny");
    }
}

