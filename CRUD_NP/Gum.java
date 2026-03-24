class Gum 
{
    String flavor;
    String brand;
    double price;
	String expiryDate;
	boolean isSugarFree;
	boolean popular;
	
	Gum(String flavor,String brand,double price,String expiryDate,boolean isSugarFree,boolean popular)
	{
		this.flavor=flavor;
		this.brand=brand;
		this.price=price;
		this.expiryDate=expiryDate;
		this.isSugarFree=isSugarFree;
		this.popular=popular;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Gum..");
		System.out.println("flavor : "+this.flavor);
		System.out.println("brand : "+this.brand);
		System.out.println("price : "+this.price);
		System.out.println("expiryDate : "+this.expiryDate);
		System.out.println("isSugarFree : "+this.isSugarFree);
		System.out.println("popular : "+this.popular);
	}
}