public class DieselCar extends AFuelCar
{
boolean particleFilter;

public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrlitre, boolean particleFilter)
{
	super(registrationNumber, make, model, numberOfDoors, kmPrlitre);
	this.particleFilter  = particleFilter;
}
@Override
public String getFuelType()
{
	return "Diesel";
}


public boolean hasParticleFilter()
{
	return particleFilter;
}

public int getRegistrationFee()
{
	int particleFilterint = (hasParticleFilter()) ? 0 : 1; // returns 0 if true and 1 if false. If thecar has a particle filter, is should NOT pay the extra fee.
	return feeFromKmPrH.calcFee(kmPrlitre) + calcUdligningsafgift() + (particleFilterint*1000);
}

private int calcUdligningsafgift()
{
	{
		int udFee = 0;
		if (kmPrlitre < 5)
		{
			udFee = 15260;
		}
		else if (kmPrlitre < 10)
		{
			udFee = 2770;
		}
		else if (kmPrlitre < 15)
		{
			udFee = 1850;
		}
		else if (kmPrlitre < 20)
		{
			udFee = 1390;
		}
		else
		{
			udFee = 130;
		}
		return udFee;
	}
}
}
