class CarrotHalwa
{
	double[] quantities;
	DryFruit[] dryFruits;
	
	CarrotHalwa(double[] quantities,DryFruit[] dryFruits)
	{
		this.quantities=quantities;
		this.dryFruits=dryFruits;
	}
	
	void getInfo()
	{
		System.out.println("Executing getInfo in CarrotHalwa..");
		for(double quantity:quantities)
		{
			System.out.println("CarrotHalwa quantity : "+quantity);
		}
		if(this.dryFruits!=null)
		{
			System.out.println("total DryFruits : "+this.dryFruits.length);
			for(DryFruit dryFruit:this.dryFruits)
			{
				dryFruit.display();
			}
		}
	}
}