class Shampoo 
{
    String brand;
    String type;
    String fragrance;
    double quantity;
    double price;
    String hairType;
    boolean sulfateFree;
    boolean parabenFree;
    String color;
    String packaging;
    String manufacturer;
    String country;
    int expiryMonths;
    String ingredients;
    String usage;
    String bottleType;
    String size;
    String quality;
    String texture;
    String shelfLife;
	
	Shampoo(String brand,String type,String fragrance,double quantity,double price,String hairType,
	boolean sulfateFree,boolean parabenFree,String color,String packaging,String manufacturer,
	String country,int expiryMonths,String ingredients,String usage,String bottleType,String size,
	String quality,String texture,String shelfLife)
	{
		this.brand=brand;
		this.type=type;
		this.fragrance=fragrance;
		this.quantity=quantity;
		this.price=price;
		this.hairType=hairType;
		this.sulfateFree=sulfateFree;
		this.parabenFree=parabenFree;
		this.color=color;
		this.packaging=packaging;
		this.manufacturer=manufacturer;
		this.country=country;
		this.expiryMonths=expiryMonths;
		this.ingredients=ingredients;
		this.usage=usage;
		this.bottleType=bottleType;
		this.size=size;
		this.quality=quality;
		this.texture=texture;
		this.shelfLife=shelfLife;
	}
	
	void getInfo()
	{
		System.out.println("brand : "+this.brand);
		System.out.println("type : "+this.type);
		System.out.println("fragrance : "+this.fragrance);
		System.out.println("quantity : "+this.quantity);
		System.out.println("price : "+this.price);
		System.out.println("hairType : "+this.hairType);
		System.out.println("sulfateFree : "+this.sulfateFree);
		System.out.println("parabenFree : "+this.parabenFree);
		System.out.println("color : "+this.color);
		System.out.println("packaging : "+this.packaging);
		System.out.println("manufacturer : "+this.manufacturer);
		System.out.println("country : "+this.country);
		System.out.println("expiryMonths : "+this.expiryMonths);
		System.out.println("ingredients : "+this.ingredients);
		System.out.println("usage : "+this.usage);
		System.out.println("bottleType : "+this.bottleType);
		System.out.println("size : "+this.size);
		System.out.println("quality : "+this.quality);
		System.out.println("texture : "+this.texture);
		System.out.println("shelfLife : "+this.shelfLife);
	}

}