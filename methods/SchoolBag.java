class SchoolBag
{
	static void checkCompartment()
	{
		System.out.println("Checking the compartment of the Bag...");
		Bag.openBag();
		Bag.closeBag();
		Bag.addItem();
		Bag.removeItem();
		Bag.checkCapacity();
	}
}