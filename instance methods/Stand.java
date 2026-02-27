class Stand 
{
    String type;
    String material;
    String color;
    double height;
    double width;
    double weight;
    double price;
    String brand;
    boolean foldable;
    String usage;
    int warrantyYears;
    String design;
    String shape;
    String country;
    String packaging;
    boolean adjustable;
    String finish;
    String loadCapacity;
    String modelNumber;
    String manufacturer;
	
	Stand(String type,String material,String color,double height,double width,double weight,double price,
	String brand,boolean foldable,String usage,int warrantyYears,String design,String shape,
	String country,String packaging,boolean adjustable,String finish,String loadCapacity,
	String modelNumber,String manufacturer)
	{
		this.type=type;
		this.material=material;
		this.color=color;
		this.height=height;
		this.width=width;
		this.weight=weight;
		this.price=price;
		this.brand=brand;
		this.foldable=foldable;
		this.usage=usage;
		this.warrantyYears=warrantyYears;
		this.design=design;
		this.shape=shape;
		this.country=country;
		this.packaging=packaging;
		this.adjustable=adjustable;
		this.finish=finish;
		this.loadCapacity=loadCapacity;
		this.modelNumber=modelNumber;
		this.manufacturer=manufacturer;
	}
	
	void getInfo()
	{
		System.out.println("Type : "+this.type);
		System.out.println("material : "+this.material);
		System.out.println("color : "+this.color);
		System.out.println("height : "+this.height);
		System.out.println("width : "+this.width);
		System.out.println("weight : "+this.weight);
		System.out.println("price : "+this.price);
		System.out.println("brand : "+this.brand);
		System.out.println("foldable : "+this.foldable);
		System.out.println("usage : "+this.usage);
		System.out.println("warrantyYears : "+this.warrantyYears);
		System.out.println("design : "+this.design);
		System.out.println("shape : "+this.shape);
		System.out.println("country : "+this.country);
		System.out.println("packaging : "+this.packaging);
		System.out.println("adjustable : "+this.adjustable);
		System.out.println("finish : "+this.finish);
		System.out.println("loadCapacity : "+this.loadCapacity);
		System.out.println("modelNumber	: "+this.modelNumber);
		System.out.println("manufacturer : "+this.manufacturer);
	}

}