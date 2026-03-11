class Printer
{
	String[] brands;
	Ink[] inks;
	
	Printer(String[] brands,Ink[] inks)
	{
		this.brands=brands;
		this.inks=inks;
	}

	void getInfo()
	{
		System.out.println("Executing getInfo in Printer..");
		if(this.brands!=null)
		{
			for(String brand:brands)
			{
				System.out.println("Brand : "+brand);
			}
		}
		if(this.inks!=null)
		{
			System.out.println("total inks : "+this.inks.length);
			for(Ink ink:this.inks)
			{
				ink.display();
			}
		}
	}
}