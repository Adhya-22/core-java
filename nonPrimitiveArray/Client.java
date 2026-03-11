class Client
{
	String clientName;
	
	Client(String clientName)
	{
		this.clientName=clientName;
	}
	
	void display()
	{
		System.out.println("Executing display in Client..");
		System.out.println("clientName : "+this.clientName);
	}
}