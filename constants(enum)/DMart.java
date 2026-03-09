class DMart
{
	int noOfEmployee;
	Location location;
	ShampooName shampooName;
	
	DMart(int noOfEmployee,Location location,ShampooName shampooName)
	{
		this.noOfEmployee=noOfEmployee;
		this.location=location;
		this.shampooName=shampooName;
	}
	
	void printInfo()
	{
		System.out.println("Number of Employee : "+this.noOfEmployee);
		if(this.location!=null)
		{
			System.out.println("Location : "+location.streetName);
		}
		System.out.println("Shampoo Name : "+this.shampooName);
	}
}