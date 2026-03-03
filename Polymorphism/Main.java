public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        VehicleInterface[] vehicles = {car, bike, boat};

        for(VehicleInterface vehicle : vehicles) {
            vehicle.go();
        }
    }
}