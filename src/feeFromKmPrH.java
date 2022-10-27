public class feeFromKmPrH
{
static int calcFee(int kmPrlitre)
{
	int regFee = 0;
	if (kmPrlitre < 5)
	{
		regFee = 10470;
	}
	else if (kmPrlitre < 10)
	{
		regFee = 5500;
	}
	else if (kmPrlitre < 15)
	{
		regFee = 2340;
	}
	else if (kmPrlitre < 20)
	{
		regFee = 1050;
	}
	else
	{
		regFee = 330;
	}
	return regFee;
}
}
