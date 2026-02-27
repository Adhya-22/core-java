class Paper 
{
    String type;
    String size;
    String color;
    String brand;
    double thickness;
    double weight;
    double price;
    String texture;
    boolean recycled;
    String usage;
    int sheetsPerPack;
    String finish;
    String manufacturer;
    String country;
    boolean waterproof;
    String quality;
    String packaging;
    String gsm;
    String shape;
    String storageCondition;
	
	Paper(String type,String size,String color,String brand,double thickness,double weight,
	double price,String texture,boolean recycled,String usage,int sheetsPerPack,String finish,
	String manufacturer,String country,boolean waterproof,String quality,String packaging,
	String gsm,String shape,String storageCondition)
	{
		this.type=type;
		this.size=size;
		this.color=color;
		this.brand=brand;
		this.thickness=thickness;
		this.weight=weight;
		this.price=price;
		this.texture=texture;
		this.recycled=recycled;
		this.usage=usage;
		this.sheetsPerPack=sheetsPerPack;
		this.finish=finish;
		this.manufacturer=manufacturer;
		this.country=country;
		this.waterproof=waterproof;
		this.quality=quality;
		this.packaging=packaging;
		this.gsm=gsm;
		this.shape=shape;
		this.storageCondition=storageCondition;
	}
	
	void getInfo()
	{
		System.out.println("type : "+this.type);
		System.out.println("size : "+this.size);
		System.out.println("color : "+this.color);
		System.out.println("brand : "+this.brand);
		System.out.println("thickness : "+this.thickness);
		System.out.println("weight : "+this.weight);
		System.out.println("price : "+this.price);
		System.out.println("texture : "+this.texture);
		System.out.println("recycled : "+this.recycled);
		System.out.println("usage : "+this.usage);
		System.out.println("sheetsPerPack : "+this.sheetsPerPack);
		System.out.println("finish : "+this.finish);
		System.out.println("manufacturer : "+this.manufacturer);
		System.out.println("country : "+this.country);
		System.out.println("waterproof : "+this.waterproof);
		System.out.println("quality : "+this.quality);
		System.out.println("packaging : "+this.packaging);
		System.out.println("gsm : "+this.gsm);
		System.out.println("shape : "+this.shape);
		System.out.println("storageCondition : "+this.storageCondition);
	}

}