class Wind
{
	double speedInKmPerHr;
	
	Wind(double speedInKmPerHr)
	{
		this.speedInKmPerHr=speedInKmPerHr;
	}
	
	void getInfo()
	{
		System.out.println("speedInKmPerHr : "+this.speedInKmPerHr);
	}
}