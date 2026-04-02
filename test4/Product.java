class Product
{
	int productId;
	String productName;
	String company;
	String manufactureDate;
	String expiryDate;
	ProductType productType;
	double price;
	double weightInGrams;
	
	Product(int productId,String productName,String company,String manufactureDate,String expiryDate,
	ProductType productType,double price,double weightInGrams)
	{
		this.productId=productId;
		this.productName=productName;
		this.company=company;
		this.manufactureDate=manufactureDate;
		this.expiryDate=expiryDate;
		this.productType=productType;
		this.price=price;
		this.weightInGrams=weightInGrams;
	}
	
	void printInfo()
	{
		System.out.println("Product ID : "+this.productId);
		System.out.println("Product Name : "+this.productName);
		System.out.println("Product Company : "+this.company);
		System.out.println("Manufacture Date : "+this.manufactureDate);
		System.out.println("Expiry Date: "+this.expiryDate);
		System.out.println("Product Type : "+this.productType);
		System.out.println("Price : "+this.price);
		System.out.println("Weight in Grams : "+this.weightInGrams);
	}
	
	
}