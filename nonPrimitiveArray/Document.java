class Document
{
	String type;
	
	Document(String type)
	{
		this.type=type;
	}
	
	void display()
	{
		System.out.println("Executing display in Document..");
		System.out.println("Document type : "+this.type);
	}
}