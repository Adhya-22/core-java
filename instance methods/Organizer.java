class Organizer 
{
    String type;
    String material;
    String color;
    double size;
    double price;
    String brand;
    boolean portable;
    String usage;
    String shape;
    String design;
    String packaging;
    String manufacturer;
    String country;
    int warrantyYears;
    String modelNumber;
    String finish;
    String storageCapacity;
    String compartmentCount;
    String weight;
    String durability;
	
	Organizer(String type,String material,String color,double size,double price,String brand,
	boolean portable,String usage,String shape,String design,String packaging,String manufacturer,
	String country,int warrantyYears,String modelNumber,String finish,String storageCapacity,
	String compartmentCount,String weight,String durability)
	{
		this.type=type;
		this.material=material;
		this.color=color;
		this.size=size;
		this.price=price;
		this.brand=brand;
		this.portable=portable;
		this.usage=usage;
		this.shape=shape;
		this.design=design;
		this.packaging=packaging;
		this.manufacturer=manufacturer;
		this.country=country;
		this.warrantyYears=warrantyYears;
		this.modelNumber=modelNumber;
		this.finish=finish;
		this.storageCapacity=storageCapacity;
		this.compartmentCount=compartmentCount;
		this.weight=weight;
		this.durability=durability;
	}
	
	void getInfo()
	{
		System.out.println("type : "+this.type);
		System.out.println("material : "+this.material);
		System.out.println("color : "+this.color);
		System.out.println("size : "+this.size);
		System.out.println("price : "+this.price);
		System.out.println("brand : "+this.brand);
		System.out.println("portable : "+this.portable);
		System.out.println("usage : "+this.usage);
		System.out.println("shape : "+this.shape);
		System.out.println("design : "+this.design);
		System.out.println("packaging : "+this.packaging);
		System.out.println("manufacturer : "+this.manufacturer);
		System.out.println("country : "+this.country);
		System.out.println("warrantyYears : "+this.warrantyYears);
		System.out.println("modelNumber : "+this.modelNumber);
		System.out.println("finish : "+this.finish);
		System.out.println("storageCapacity : "+this.storageCapacity);
		System.out.println("compartmentCount : "+this.compartmentCount);
		System.out.println("weight : "+this.weight);
		System.out.println("durability : "+this.durability);
	}

}