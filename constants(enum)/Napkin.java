class Napkin
{
	int noOfNapkin;
	Color color;
	NapkinType napkinType;
	
	Napkin(int noOfNapkin,Color color,NapkinType napkinType)
	{
		this.noOfNapkin=noOfNapkin;
		this.color=color;
		this.napkinType=napkinType;
	}
	
	void printInfo()
	{
		System.out.println("Number of Napkin : "+this.noOfNapkin);
		if(this.color!=null)
		{
			System.out.println("Primary color : "+color.primaryColor);
		}
		System.out.println("Napkin Type : "+this.napkinType);
	}
	
}