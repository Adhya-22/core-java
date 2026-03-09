class Horlicks
{
	double quantity;
	Milk milk;              
    Flavour flavour;        

    Horlicks(double quantity,Milk milk,Flavour flavour)
	{
		this.quantity=quantity;
		this.milk=milk;
		this.flavour=flavour;
	}
	
	void printInfo()
	{
		System.out.println("Horlicks Quantity : "+this.quantity);
		if(this.milk!=milk)
		{
			System.out.println("Milk type : "+milk.type);
		}
		System.out.println("Flavour : "+this.flavour);
	}
}