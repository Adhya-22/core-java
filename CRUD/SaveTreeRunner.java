class SaveTreeRunner
{
	public static void main(String[] args)
	{
		String[] names=new String[10];
		
		SaveTree saveTree=new SaveTree(names);
		
		saveTree.save("Mango Tree");
		saveTree.save("Neem Tree");
		saveTree.save("Banyan Tree");
		saveTree.save("Oak Tree ");
		saveTree.save("Pine Tree");
		saveTree.save("Coconut Tree");
		saveTree.save("Apple Tree");
		saveTree.save("Teak Tree");
		saveTree.save("Eucalyptus Tree");
		saveTree.save("Maple Tree");
		
		boolean found=saveTree.search("Coconut Tree");
		System.out.println("Tree name found : "+found);
		
		boolean update=saveTree.update(8,"Gauva Tree");
		System.out.println("Updated ? : "+update);
		
		boolean update1=saveTree.update("Pine Tree","Tangerine Tree");
		System.out.println("Updated ? : "+update1);
		
		String delete=saveTree.delete(3);
		System.out.println("Deleted ? : "+delete);
		
		String delete1=saveTree.delete("Apple Tree");
		System.out.println("Deleted ? : "+delete1);
	}
}