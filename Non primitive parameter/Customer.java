class Customer
{
	String customerName;
	
	Customer(String customerName)
	{
		this.customerName=customerName;
	}
	
	void getInfo()
	{
		System.out.println("customerName : "+this.customerName);
	}
}