class WalnutRunner
{
	public static void main(String[] args)
	{
		Tree tree=new Tree(10);
		WalnutType type=WalnutType.ENGLISH;
		Walnut walnut=new Walnut(1,tree,type);
		walnut.printInfo();
		
		Tree tree2=new Tree(5);
		WalnutType type2=WalnutType.BLACK;
		Walnut walnut2=new Walnut(1,tree2,type2);
		walnut2.printInfo();
		
		Tree tree3=new Tree(2);
		WalnutType type3=WalnutType.WHITE;
		Walnut walnut3=new Walnut(1,tree3,type3);
		walnut3.printInfo();
		
		Tree tree4=new Tree(15);
		WalnutType type4=WalnutType.BUTTERNUT;
		Walnut walnut4=new Walnut(1,tree4,type4);
		walnut4.printInfo();
	}
}