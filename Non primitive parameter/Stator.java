class Stator
{
	int noOfCoils;
	
	Stator(int noOfCoils)
	{
		this.noOfCoils=noOfCoils;
	}
	
	void getInfo()
	{
		System.out.println("noOfCoils : "+this.noOfCoils);
	}
}