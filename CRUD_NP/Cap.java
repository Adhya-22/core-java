class Cap
{
	String brand;
	String color;
	String type;
	double price;
	String material;
	boolean hasLogo;
	
	Cap(String brand,String color,String type,double price,String material,boolean hasLogo)
	{
		this.brand=brand;
		this.color=color;
		this.type=type;
		this.price=price;
		this.material=material;
		this.hasLogo=hasLogo;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Cap..");
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Type : "+this.type);
		System.out.println("price : "+this.price);
		System.out.println("material : "+this.material);
		System.out.println("hasLogo : "+this.hasLogo);
	}
}