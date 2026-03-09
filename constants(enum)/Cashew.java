class Cashew
{
	int quantity;
	Tree tree;
	CashewSize cashewSize;
	
	Cashew(int quantity,Tree tree,CashewSize cashewSize)
	{
		this.quantity=quantity;
		this.tree=tree;
		this.cashewSize=cashewSize;
	}
	
	void printInfo()
	{
		System.out.println("Cashew Quantity : "+this.quantity);
		if(this.tree!=null)
		{
			System.out.println("Number of trees : "+tree.noOfTrees);
		}
		System.out.println("Cashew Size : "+this.cashewSize);
	}
}