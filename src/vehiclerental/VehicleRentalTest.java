package vehiclerental;

public class VehicleRentalTest {
    public static void main(String[] args) {
        VehicleRental<Car> carRental = new VehicleRental<>();
        carRental.rent(new Car());

        VehicleRental<Van> vanRental = new VehicleRental<>();
        vanRental.rent(new Van());

        VehicleRental<MotorCycle> bikeRental = new VehicleRental<>();
        bikeRental.rent(new MotorCycle());
    }
}
