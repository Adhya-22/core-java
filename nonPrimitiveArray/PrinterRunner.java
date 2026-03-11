class PrinterRunner
{
	public static void main(String[] args)
	{
		String[] brands={"Canon","Epson","HP"};
		
		Ink ink1=new Ink("Black");
		Ink ink2=new Ink("Red");
		Ink ink3=new Ink("Blue");
		
		Ink[] inks={ink1,ink2,ink3};
		
		Printer printer=new Printer(brands,inks);
		printers.getInfo();
	}
}