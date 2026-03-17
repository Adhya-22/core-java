class SavePastaRunner
{
	public static void main(String[] args)
	{
		String[] types=new String[10];
		
		SavePasta savePasta=new SavePasta(types);
		
		savePasta.save("Spaghetti");
		savePasta.save("Penne");
		savePasta.save("Fusilli");
		savePasta.save("Rigatoni");
		savePasta.save("Fettuccine");
		savePasta.save("Farfalle");
		savePasta.save("Linguine");
		savePasta.save("Ravioli");
		savePasta.save("Macaroni");
		savePasta.save("Orecchiette");
		
		boolean found=savePasta.search("Rigatoni");
		System.out.println("Pasta Type found : "+found);
		
		boolean updated=savePasta.update(11,"White");
		System.out.println("Paste type updated ? : "+updated);
		
		boolean updated1=savePasta.update("Linguine","White");
		System.out.println("Paste type updated ? : "+updated1);
		
		String delete=savePasta.delete(3);
		System.out.println("Deleted ? : "+delete);
		
		String delete1=savePasta.delete("Penne");
		System.out.println("Deleted ? : "+delete1);
		
	}
}