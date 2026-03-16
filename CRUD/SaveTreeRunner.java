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
	}
}