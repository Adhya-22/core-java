class Paneer
{
	int quantity;
	Dish dish;
	PaneerShape pannerShape;
	
	Paneer(int quantity,Dish dish,PaneerShape pannerShape)
	{
		this.quantity=quantity;
		this.dish=dish;
		this.pannerShape=pannerShape;
	}
	
	void printInfo()
	{
		System.out.println("Paneer Quantity : "+this.quantity);
		if(this.dish!=null)
		{
			System.out.println("Paneer Dish : "+dish.name);
		}
		System.out.println("Paneer Shape : "+this.pannerShape);
	}
}