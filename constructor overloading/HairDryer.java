class HairDryer 
{
    String brand;
    String model;
    int powerWatts;
    double price;
    boolean hasCoolAirOption;
	
	HairDryer()
	{
		System.out.println("No parameter constructor...");
	}
	
	HairDryer(String brand)
	{
		this.brand=brand;
	}
	
	HairDryer(String brand,String model)
	{
		this.brand=brand;
		this.model=model;
	}
	
	HairDryer(String brand,String model,int powerWatts)
	{
		this.brand=brand;
		this.model=model;
		this.powerWatts=powerWatts;
	}
	
	HairDryer(String brand,String model,int powerWatts,double price)
	{
		this.brand=brand;
		this.model=model;
		this.powerWatts=powerWatts;
		this.price=price;
	}
	
	HairDryer(String brand,String model,int powerWatts,double price,boolean hasCoolAirOption)
	{
		this.brand=brand;
		this.model=model;
		this.powerWatts=powerWatts;
		this.price=price;
		this.hasCoolAirOption=hasCoolAirOption;
	}
}