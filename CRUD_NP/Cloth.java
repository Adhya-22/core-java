class Cloth
{
	String color;
    String size;
    double price;
	String material;
    boolean washable;
    boolean stretchable;
	
	Cloth(String color,String size,double price,String material,boolean washable,boolean stretchable)
	{
		this.color=color;
		this.size=size;
		this.price=price;
		this.material=material;
		this.washable=washable;
		this.stretchable=stretchable;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Cloth..");
		System.out.println("Color : "+this.color);
		System.out.println("size : "+this.size);
		System.out.println("price : "+this.price);
		System.out.println("material : "+this.material);
		System.out.println("washable : "+this.washable);
		System.out.println("stretchable : "+this.stretchable);
	}
}