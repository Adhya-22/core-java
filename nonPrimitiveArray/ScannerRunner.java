class ScannerRunner
{
	public static void main(String[] args)
	{
		String[] names={"Canon","Epson","Fujitsu"};
		
		Document documents1=new Document(".txt");
		Document documents2=new Document(".pdf");
		Document documents3=new Document(".jpeg");
		
		Document[] documents={documents1,documents2,documents3};
		
		Scanner scanner=new Scanner(names,documents);
		scanner.getInfo();
	}
}