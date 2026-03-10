class SweetShop
{
	String shopName;
	
	SweetShop(String shopName)
	{
		this.shopName=shopName;
	}
	
	void display()
	{
		System.out.println("Executing display in SweetShop..");
		System.out.println("SweetShop Name : "+this.shopName);
	}
}