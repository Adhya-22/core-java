class SambarStoreRunner
{
	public static void main(String[] args)
	{
		Sambar[] sambars=new Sambar[10];
		
		SambarStore sambarStore=new SambarStore(sambars);
		
		Sambar sambar1=new Sambar(30, "Traditional", "Pressure Cook", 4, "Easy", true);
		sambarStore.save(sambar1);
		
		Sambar sambar2=new Sambar(45, "Hotel Style", "Boiling", 6, "Medium", true);
		sambarStore.save(sambar2);
		
		Sambar sambar3=new Sambar(25, "Quick", "Pressure Cook", 3, "Easy", false);
		sambarStore.save(sambar3);
		
		Sambar sambar4=new Sambar(50, "Village Style", "Slow Cook", 8, "Hard", true);
		sambarStore.save(sambar4);
		
		Sambar sambar5=new Sambar(35, "Andhra Style", "Boiling", 5, "Medium", true);
		sambarStore.save(sambar5);
		
		Sambar sambar6=new Sambar(20, "Instant", "Pressure Cook", 2, "Easy", false);
		sambarStore.save(sambar6);
		
		Sambar sambar7=new Sambar(40, "Kerala Style", "Slow Cook", 6, "Medium", true);
		sambarStore.save(sambar7);
		
		Sambar sambar8=new Sambar(55, "Festival Style", "Boiling", 10, "Hard", true);
		sambarStore.save(sambar8);
		
		Sambar sambar9=new Sambar(30, "Home Style", "Pressure Cook", 4, "Easy", false);
		sambarStore.save(sambar9);
		
		Sambar sambar10=new Sambar(45, "Spicy Style", "Boiling", 7, "Medium", true);
		sambarStore.save(sambar10);
	}
}