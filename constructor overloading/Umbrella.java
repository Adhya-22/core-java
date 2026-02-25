class Umbrella 
{
    String brand;
    String color;
    double price;
    double size;
    boolean isFoldable;
	
	Umbrella()
	{
		System.out.println("No parametere Constructor..");
	}
	
	Umbrella(String brand)
	{
		this.brand=brand;
	}
	
	Umbrella(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
	}
	
	Umbrella(String brand,String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	Umbrella(String brand,String color,double price,double size)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.size=size;
	}
	
	Umbrella(String brand,String color,double price,double size,boolean isFoldable)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.size=size;
		this.isFoldable=isFoldable;
	}
}
