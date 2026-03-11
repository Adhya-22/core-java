class Occasion
{
	String occasionName;
	
	Occasion(String occasionName)
	{
		this.occasionName=occasionName;
	}
	
	void display()
	{
		System.out.println("Executing display in Occasion..");
		System.out.println("Occasion Name : "+this.occasionName);
	}
}