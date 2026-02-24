class Delivery
{
	static void pickUp()
	{
		System.out.println("Ready to pickUp...");
		Market.storeVegetables();
		Market.storeGroceris();
		Market.storeFruits();
		Market.storeDryFruits();
		Market.storeJunkFood();
	}
}
