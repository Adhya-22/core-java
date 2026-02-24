class Chocolate
{
	void eat()
	{
		System.out.println("Eating Chocolate...");
		melt();
	}
	
	static void melt()
	{
		System.out.println("Melting Chocolate...");
	}
}

    //Static can only invoke Static
	//Non static can invoke both static and non static