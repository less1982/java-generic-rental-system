package vehiclerental;

public class VehicleRental<T extends Vehicle> {
    public void rent(T vehicle) {
        System.out.println("Renting vehicle...");
        vehicle.start();
        vehicle.drive();
        vehicle.stop();
    }
}
