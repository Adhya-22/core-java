class DumbBell 
{
    String brand;
    double weight;
    String material;
    String color;
    double price;
    String gripType;
    boolean adjustable;
    String usage;
    String coating;
    String size;
    String shape;
    String packaging;
    int warrantyYears;
    String manufacturer;
    String country;
    String modelNumber;
    String finish;
    String loadCapacity;
    String gymType;
    String durability;
	
	DumbBell(String brand,double weight,String material,String color,double price,String gripType,
	boolean adjustable,String usage,String coating,String size,String shape,String packaging,
	int warrantyYears,String manufacturer,String country,String modelNumber,String finish,
	String loadCapacity,String gymType,String durability)
	{
		this.brand=brand;
		this.weight=weight;
		this.material=material;
		this.color=color;
		this.price=price;
		this.gripType=gripType;
		this.adjustable=adjustable;
		this.usage=usage;
		this.coating=coating;
		this.size=size;
		this.shape=shape;
		this.packaging=packaging;
		this.warrantyYears=warrantyYears;
		this.manufacturer=manufacturer;
		this.country=country;
		this.modelNumber=modelNumber;
		this.finish=finish;
		this.loadCapacity=loadCapacity;
		this.gymType=gymType;
		this.durability=durability;
	}
	
	void getInfo()
	{
		System.out.println("brand : "+this.brand);
		System.out.println("weight : "+this.weight);
		System.out.println("material : "+this.material);
		System.out.println("color : "+this.color);
		System.out.println("price : "+this.price);
		System.out.println("gripType : "+this.gripType);
		System.out.println("adjustable : "+this.adjustable);
		System.out.println("usage : "+this.usage);
		System.out.println("coating : "+this.coating);
		System.out.println("size : "+this.size);
		System.out.println("shape : "+this.shape);
		System.out.println("packaging : "+this.packaging);
		System.out.println("warrantyYears : "+this.warrantyYears);
		System.out.println("manufacturer : "+this.manufacturer);
		System.out.println("country : "+this.country);
		System.out.println("modelNumber : "+this.modelNumber);
		System.out.println("finish : "+this.finish);
		System.out.println("loadCapacity : "+this.loadCapacity);
		System.out.println("gymType : "+this.gymType);
		System.out.println("durability : "+this.durability);
	}

}