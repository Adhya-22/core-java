class Led
{
	double voltage;
	
	Led(double voltage)
	{
		this.voltage=voltage;
	}
	
	void getInfo()
	{
		System.out.println("voltage : "+this.voltage);
	}
}