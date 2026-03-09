class CashewRunner
{
	public static void main(String[] args)
	{
		Tree tree=new Tree(10);
		CashewSize size=CashewSize.SMALL;
		Cashew cashew=new Cashew(1,tree,size);
		cashew.printInfo();
		
		Tree tree2=new Tree(5);
		CashewSize size2=CashewSize.MEDIUM;
		Cashew cashew2=new Cashew(1,tree2,size2);
		cashew2.printInfo();
		
		Tree tree3=new Tree(2);
		CashewSize size3=CashewSize.GAINT;
		Cashew cashew3=new Cashew(1,tree3,size3);
		cashew3.printInfo();
		
		Tree tree4=new Tree(15);
		CashewSize size4=CashewSize.LARGE;
		Cashew cashew4=new Cashew(1,tree4,size4);
		cashew4.printInfo();
	}
}