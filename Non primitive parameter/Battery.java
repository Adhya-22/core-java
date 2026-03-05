class Battery
{
	String type;
	
	Battery(String type)
	{
		this.type=type;
	}
	
	void getInfo()
	{
		System.out.println("type : "+this.type);
	}
}