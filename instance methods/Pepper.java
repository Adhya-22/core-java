class Pepper 
{
    String type;
    String color;
    String origin;
    double weight;
    double price;
    String flavor;
    boolean organic;
    String packaging;
    String brand;
    String form;
    String harvestSeason;
    int shelfLifeMonths;
    String grade;
    String supplier;
    String usage;
    boolean spicy;
    String quality;
    String storage;
    double moistureLevel;
    String exportCountry;
	
	Pepper(String type,String color,String origin,double weight,double price,String flavor,boolean organic,
    String packaging,String brand,String form,String harvestSeason,int shelfLifeMonths,String grade,
	String supplier,String usage,boolean spicy,String quality,String storage,double moistureLevel,
	String exportCountry)
	{
		this.type=type;
		this.color=color;
		this.origin=origin;
		this.weight=weight;
		this.price=price;
		this.flavor=flavor;
		this.organic=organic;
		this.packaging=packaging;
		this.brand=brand;
		this.form=form;
		this.harvestSeason=harvestSeason;
		this.shelfLifeMonths=shelfLifeMonths;
		this.grade=grade;
		this.supplier=supplier;
		this.usage=usage;
		this.spicy=spicy;
		this.quality=quality;
		this.storage=storage;
		this.moistureLevel=moistureLevel;
		this.exportCountry=exportCountry;
	}
	
	void getInfo()
	{
		System.out.println("Type : "+this.type);
		System.out.println("Color : "+this.color);
		System.out.println("Origin : "+this.origin);
		System.out.println("weight : "+this.weight);
		System.out.println("Price : "+this.price);
		System.out.println("Flavour : "+this.flavor);
		System.out.println("organic : "+this.organic);
		System.out.println("Package : "+this.packaging);
		System.out.println("brand : "+this.brand);
		System.out.println("form : "+this.form);
		System.out.println("harvestSeason : "+this.harvestSeason);
		System.out.println("shelfLifeMonths : "+this.shelfLifeMonths);
		System.out.println("Grade : "+this.grade);
		System.out.println("Supplier : "+this.supplier);
		System.out.println("usage : "+this.usage);
		System.out.println("Spicy : "+this.spicy);
		System.out.println("Quality : "+this.quality);
		System.out.println("Storage : "+this.storage);
		System.out.println("Moisture Level : "+this.moistureLevel);
		System.out.println("exportCountry : "+this.exportCountry);
	}

}