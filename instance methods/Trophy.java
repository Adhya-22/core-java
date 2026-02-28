class Trophy 
{
    String name;
    String material;
    String color;
    double height;
    double weight;
    double price;
    String event;
    String winnerName;
    int year;
    String design;
    String brand;
    String engraving;
    String shape;
    String packaging;
    boolean customized;
    String country;
    String manufacturer;
    String finish;
    String category;
    String sponsor;
	
	Trophy(String name,String material,String color,double height,double weight,double price,
	String event,String winnerName,int year,String design,String brand,String engraving,String shape,
	String packaging,boolean customized,String country,String manufacturer,String finish,String category,
    String sponsor)
	{
		this.name=name;
		this.material=material;
		this.color=color;
		this.height=height;
		this.weight=weight;
		this.price=price;
		this.event=event;
		this.winnerName=winnerName;
		this.year=year;
		this.design=design;
		this.brand=brand;
		this.engraving=engraving;
		this.shape=shape;
		this.packaging=packaging;
		this.customized=customized;
		this.country=country;
		this.manufacturer=manufacturer;
		this.finish=finish;
		this.category=category;
		this.sponsor=sponsor;
	}
	
	void getInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("material : "+this.material);
		System.out.println("color : "+this.color);
		System.out.println("height : "+this.height);
		System.out.println("weight : "+this.weight);
		System.out.println("price : "+this.price);
		System.out.println("event : "+this.event);
		System.out.println("winnerName : "+this.winnerName);
		System.out.println("year : "+this.year);
		System.out.println("design : "+this.design);
		System.out.println("brand : "+this.brand);
		System.out.println("engraving : "+this.engraving);
		System.out.println("shape : "+this.shape);
		System.out.println("packaging : "+this.packaging);
		System.out.println("customized : "+this.customized);
		System.out.println("country : "+this.country);
		System.out.println("manufacturer : "+this.manufacturer);
		System.out.println("finish : "+this.finish);
		System.out.println("category : "+this.category);
		System.out.println("sponsor : "+this.sponsor);
	}
}