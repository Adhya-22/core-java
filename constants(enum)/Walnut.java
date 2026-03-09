class Walnut
{
	int quantityInKg;        
    Tree tree;           
    WalnutType walnutType;   

	Walnut(int quantityInKg,Tree tree,WalnutType walnutType)
	{
		this.quantityInKg=quantityInKg;
		this.tree=tree;
		this.walnutType=walnutType;
	}
	
	void printInfo()
	{
		System.out.println("Walnut quantity In Kg : "+this.quantityInKg);
		if(this.tree!=null)
		{
			System.out.println("Number of Trees : "+tree.noOfTrees);
		}
		System.out.println("Walnut Type : "+this.walnutType);
	}
}