class Product
{
	String name;
    String maker;
    String mfgDate;
    double cost;
    ProductType productType;
    String seller;
    WarrantyYears warrantyYears;
    boolean warrantyExpired;
    int uniqueId;
    String originCountry;
	
	Product(String name,String maker,String mfgDate,double cost,ProductType productType,String seller,
	WarrantyYears warrantyYears,boolean warrantyExpired,int uniqueId,String originCountry)
	{
		this.name=name;
		this.maker=maker;
		this.mfgDate=mfgDate;
		this.cost=cost;
		this.productType=productType;
		this.seller=seller;
		this.warrantyYears=warrantyYears;
		this.warrantyExpired=warrantyExpired;
		this.uniqueId=uniqueId;
		this.originCountry=originCountry;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Product...");
		System.out.println("Name : "+this.name);
		System.out.println("Maker : "+this.maker);
		System.out.println("Mfg Date : "+this.mfgDate);
		System.out.println("Cost : "+this.cost);
		System.out.println("Product Type : "+this.productType);
		System.out.println("Seller : "+this.seller);
		System.out.println("Warranty Years : "+this.warrantyYears);
		System.out.println("Warranty Expired : "+this.warrantyExpired);
		System.out.println("Unique Id : "+this.uniqueId);
		System.out.println("Origin Country : "+this.originCountry);
	}
}