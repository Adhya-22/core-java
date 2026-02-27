class WallPaper 
{
    String brand;
    String color;
    String pattern;
    String material;
    double length;
    double width;
    double price;
    String texture;
    boolean washable;
    boolean waterproof;
    String style;
    String roomType;
    String finish;
    String country;
    int warrantyYears;
    double weight;
    String designCode;
    boolean peelAndStick;
    String packaging;
    String manufacturer;
	
	WallPaper(String brand,String color,String pattern,String material,double length,double width,
	double price,String texture,boolean washable,boolean waterproof,String style,String roomType,
	String finish,String country,int warrantyYears,double weight,String designCode,boolean peelAndStick,
	String packaging,String manufacturer)
	{
		this.brand=brand;
		this.color=color;
		this.pattern=pattern;
		this.material=material;
		this.length=length;
		this.width=width;
		this.price=price;
		this.texture=texture;
		this.washable=washable;
		this.waterproof=waterproof;
		this.style=style;
		this.roomType=roomType;
		this.finish=finish;
		this.country=country;
		this.warrantyYears=warrantyYears;
		this.weight=weight;
		this.designCode=designCode;
		this.peelAndStick=peelAndStick;
		this.packaging=packaging;
		this.manufacturer=manufacturer;
	}
	
	void getInfo()
	{
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Pattern : "+this.pattern);
		System.out.println("Material : "+this.material);
		System.out.println("Length : "+this.length);
		System.out.println("Width : "+this.width);
		System.out.println("Price : "+this.price);
		System.out.println("Texture : "+this.texture);
		System.out.println("Washable : "+this.washable);
		System.out.println("WaterProof : "+this.waterproof);
		System.out.println("Style: "+this.style);
		System.out.println("Room Type : "+this.roomType);
		System.out.println("Finish : "+this.finish);
		System.out.println("Country : "+this.country);
		System.out.println("Warranty year : "+this.warrantyYears);
		System.out.println("weight : "+this.weight);
		System.out.println("designCode : "+this.designCode);
		System.out.println("peelAndStick : "+this.peelAndStick);
		System.out.println("packaging : "+this.packaging);
		System.out.println("Manufacturer : "+this.manufacturer);
	}

}