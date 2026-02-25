class Clip 
{
    String material;
    String color;
    double size;
    double price;
    boolean isDecorative;
	
	Clip()
	{
		System.out.println("No parameter constructor..");
	}
	
	Clip(String material)
	{
		this.material=material;
	}
	
	Clip(String material,String color)
	{
		this.material=material;
		this.color=color;
	}
	
	Clip(String material,String color,double size)
	{
		this.material=material;
		this.color=color;
		this.size=size;
	}
	
	Clip(String material,String color,double size,double price)
	{
		this.material=material;
		this.color=color;
		this.size=size;
		this.price=price;
	}
	
	Clip(String material,String color,double size,double price,boolean isDecorative)
	{
		this.material=material;
		this.color=color;
		this.size=size;
		this.price=price;
		this.isDecorative=isDecorative;
	}
}