class Scanner
{
	String[] brands;
	Document[] documents;
	
	Scanner(String[] brands,Document[] documents)
	{
		this.brands=brands;
		this.documents=documents;
	}
	
	void getInfo()
	{
		System.out.println("Executing getInfo in Scanner..");
		if(this.brands!=null)
		{
			for(String brand:brands)
			{
				System.out.println("brand : "+brand);
			}
		}
		if(this.documents!=null)
		{
			System.out.println("total Documentes : "+this.documents.length);
			for(Document document:this.documents)
			{
				document.display();
			}
		}
	}
}