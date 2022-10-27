public class ElectricCar extends ACar
{

int batteryCapacity; // in Wh
int maxRange; // in km

public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange)
{
	super(registrationNumber, make, model, numberOfDoors);
	this.batteryCapacity = batteryCapacity;
	this.maxRange = maxRange;

}

public int getBatteryCapacity()
{
	return batteryCapacity;
}

public int getMaxRange()
{
	return maxRange;
}

public int getWhPrKm()
{
	return batteryCapacity/maxRange;   // this should probably be a double, to avoid rounding errors
}


@Override
public int getRegistrationFee()
{
	double WhPrKm = (double) batteryCapacity/ (double) maxRange; // I refuse to calculate as int
	double KmPrLDouble = 100/ WhPrKm/91.25; //needs to be calculated as double because of decimal points.
	int KmPerLitre = (int) Math.round(KmPrLDouble); //Double is rounded and then converted to int.
	return feeFromKmPrH.calcFee(KmPerLitre); // calculates fee from km/L.
}

@Override
public String toString()
{
	return "ElectricCar" + '\n' +
			"batteryCapacity=" + batteryCapacity + '\n' +
			"maxRange=" + maxRange + '\n' +
			"registrationNumber=" + registrationNumber + '\n' +
			"make=" + make + '\n' +
			"model=" + model + '\n' +
			"numberOfDoors=" + numberOfDoors + '\n' +
			"RegistrationFee=" + getRegistrationFee() + '\n' ;
}
}
