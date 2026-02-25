class Notebook 
{
    String brand;
    int pages;
    String size;
    double price;
    boolean isHardCover;
	
	Notebook()
	{
		System.out.println("No parameter constructor...");
	}
	
	Notebook(String brand)
	{
		this.brand=brand;
	}
	
	Notebook(String brand,int pages)
	{
		this.brand=brand;
		this.pages=pages;
	}
	
	Notebook(String brand,int pages,String size)
	{
		this.brand=brand;
		this.pages=pages;
		this.size=size;
	}
	
	Notebook(String brand,int pages,String size,double price)
	{
		this.brand=brand;
		this.pages=pages;
		this.size=size;
		this.price=price;
	}
	
	Notebook(String brand,int pages,String size,double price,boolean isHardCover)
	{
		this.brand=brand;
		this.pages=pages;
		this.size=size;
		this.price=price;
		this.isHardCover=isHardCover;
		
	}
}