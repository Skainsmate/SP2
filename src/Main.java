public class Main {

public static void main(String[] args) {
	FleetOfCars fleetOfCars = new FleetOfCars();


	fleetOfCars.addCar(new ElectricCar("AB 12 345", "Tesla", "Model X", 5, 87, 417));
	fleetOfCars.addCar(new DieselCar("CD 67 890", "Alfa Romeo", "MiTo", 3, 15, true));
	fleetOfCars.addCar(new GasolineCar("QW 45 789", "Fiat", "500", 3, 25));


	System.out.println("Fleet of cars:\n");
	System.out.println(fleetOfCars);

	System.out.println("Total registration fee for fleet: " + fleetOfCars.getTotalRegistrationFeeForFleet() + " kr.");
}
}