class Salt 
{
    String brand;
    String type;          
    double weight;
    double price;
    boolean isIodized;
    String packagingType;
	
	Salt(String brand,String type,double weight,double price,boolean isIodized,String packagingType)
	{
		this.brand=brand;
		this.type=type;
		this.weight=weight;
		this.price=price;
		this.isIodized=isIodized;
		this.packagingType=packagingType;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Salt..");
		System.out.println("brand : "+this.brand);
		System.out.println("type : "+this.type);
		System.out.println("weight : "+this.weight);
		System.out.println("price : "+this.price);
		System.out.println("isIodized : "+this.isIodized);
		System.out.println("packagingType : "+this.packagingType);
	}
}