class Pawn 
{
    String color;
    String material;
    double height;
    double weight;
    boolean isPromoted;
	
	Pawn()
	{
		System.out.println("No parameter constructor...");
	}
	
	Pawn(String color)
	{
		this.color=color;
	}
	
	Pawn(String color,String material)
	{
		this.color=color;
		this.material=material;
	}
	
	Pawn(String color,String material,double height)
	{
		this.color=color;
		this.material=material;
		this.height=height;
	}
	
	Pawn(String color,String material,double height,double weight)
	{
		this.color=color;
		this.material=material;
		this.height=height;
		this.weight=weight;
	}
	
	Pawn(String color,String material,double height,double weight,boolean isPromoted)
	{
		this.color=color;
		this.material=material;
		this.height=height;
		this.weight=weight;
		this.isPromoted=isPromoted;
	}
}