class Cable
{
	double lengthInMeter;
	
	Cable(double lengthInMeter)
	{
		this.lengthInMeter=lengthInMeter;
	}
	
	void getInfo()
	{
		System.out.println("lengthInMeter : "+this.lengthInMeter);
	}
}