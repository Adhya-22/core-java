class Circus
{
	String circusName;
	
	Circus(String circusName)
	{
		this.circusName=circusName;
	}
	
	void display()
	{
		System.out.println("Executing display in Circus..");
		System.out.println("circus Name : "+this.circusName);
	}
}