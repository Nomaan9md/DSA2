package association;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Driver driver = new Driver("Jhon");
        car.ShowCar();
        driver.driveCar(car);
    }
}
