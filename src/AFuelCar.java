public abstract class AFuelCar extends ACar
{
int kmPrlitre;

public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrlitre)
{
	super(registrationNumber, make, model, numberOfDoors);
	this.kmPrlitre = kmPrlitre;
}


public abstract String getFuelType();

public int getKmPrLitre()
{
	return kmPrlitre;
}



}

/*
3.    Abstrakt Klasse AFuelCar. Denne klasse skal nedarve fra Acar. Den skal tilføje to metoder:
a.    abstract String getFuelType(); // should return “Gasoline” or “Diesel”

b.    int kmPrLitre(); // should return how many kilometres the car can drive on 1 litre of fuel

 */
