class FarmChicken extends Chicken
{	
	FarmChicken()
	{
		super(1.5,360,false);
		System.out.println("No-arg contructor in FarmChicken");
	}
	
	FarmChicken(double quantity,double price,boolean marinated)
	{
		super(quantity,price,marinated);
		System.out.println("double,double,boolean construtor in FarmChicken");
	}
	
	FarmChicken(boolean marinated)
	{
		super(1,240,marinated);
		System.out.println("boolean constructor in FarmChicken");
	}
}