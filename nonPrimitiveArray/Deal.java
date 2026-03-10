class Deal
{
	String dealName;
	
	Deal(String dealName)
	{
		this.dealName=dealName;
	}
	
	void display()
	{
		System.out.println("Executing display in Deal..");
		System.out.println("Deal Name : "+this.dealName);
	}
}