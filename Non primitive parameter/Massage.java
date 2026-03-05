class Massage
{
	String massageType;
	
	Massage(String massageType)
	{
		this.massageType=massageType;
	}
	
	void getInfo()
	{
		System.out.println("massageType : "+this.massageType);
	}
}