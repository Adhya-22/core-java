class Pumpkin
{
	double weight;
	Farm farm;
	PumpkinSize pumpkinSize;
	
	Pumpkin(double weight,Farm farm,PumpkinSize pumpkinSize)
	{
		this.weight=weight;
		this.farm=farm;
		this.pumpkinSize=pumpkinSize;
	}
	
	void printInfo()
	{
		System.out.println("Pumpkin weight : "+this.weight);
		if(this.farm!=null)
		{
			System.out.println("Farm Size : "+farm.sizeInAcre);
		}
		System.out.println("Pumpkin size : "+this.pumpkinSize);
	}
}