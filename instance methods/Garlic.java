class Garlic 
{
    String variety;
    String origin;
    double weight;
    double price;
    String color;
    boolean organic;
    String harvestSeason;
    int shelfLifeDays;
    String supplier;
    String size;
    String flavor;
    String packaging;
    boolean fresh;
    String quality;
    String storageType;
    String exportCountry;
    String grade;
    double moistureLevel;
    String marketType;
    boolean peeled;
	
	Garlic(String variety,String origin,double weight,double price,String color,boolean organic,
	String harvestSeason,int shelfLifeDays,String supplier,String size,String flavor,String packaging,
	boolean fresh,String quality,String storageType,String exportCountry,String grade,double moistureLevel,
	String marketType,boolean peeled)
	{
		this.variety=variety;
		this.origin=origin;
		this.weight=weight;
		this.price=price;
		this.color=color;
		this.organic=organic;
		this.harvestSeason=harvestSeason;
		this.shelfLifeDays=shelfLifeDays;
		this.supplier=supplier;
		this.size=size;
		this.flavor=flavor;
		this.packaging=packaging;
		this.fresh=fresh;
		this.quality=quality;
		this.storageType=storageType;
		this.exportCountry=exportCountry;
		this.grade=grade;
		this.moistureLevel=moistureLevel;
		this.marketType=marketType;
		this.peeled=peeled;
	}
	
	void getInfo()
	{
		System.out.println("variety : "+this.variety);
		System.out.println("origin : "+this.origin);
		System.out.println("weight : "+this.weight);
		System.out.println("price : "+this.price);
		System.out.println("color : "+this.color);
		System.out.println("organic : "+this.organic);
		System.out.println("harvestSeason : "+this.harvestSeason);
		System.out.println("shelfLifeDays : "+this.shelfLifeDays);
		System.out.println("supplier : "+this.supplier);
		System.out.println("size : "+this.size);
		System.out.println("flavor : "+this.flavor);
		System.out.println("packaging : "+this.packaging);
		System.out.println("fresh : "+this.fresh);
		System.out.println("quality : "+this.quality);
		System.out.println("storageType : "+this.storageType);
		System.out.println("exportCountry : "+this.exportCountry);
		System.out.println("grade : "+this.grade);
		System.out.println("moistureLevel : "+this.moistureLevel);
		System.out.println("marketType : "+this.marketType);
		System.out.println("peeled : "+this.peeled);
	}

}