public class GasolineCar extends AFuelCar
{


public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrlitre)
{
	super(registrationNumber, make, model, numberOfDoors, kmPrlitre);
}

@Override
public String getFuelType()
{
	return "Gasoline";
}


public int getRegistrationFee()
{
	return feeFromKmPrH.calcFee(kmPrlitre);
}

}

