class FiberRunner
{
	public static void main(String[] args) 
	{
        Fiber fiber1 = new Fiber();
		
        fiber1.name = "Optical Fiber";
        fiber1.length = 500.5;
        fiber1.vendors = new String[]{"Airtel", "Jio", "BSNL"};
		
		System.out.println("---- Fiber 1 Details ----");
        System.out.println("Name: " + fiber1.name);
        System.out.println("Length: " + fiber1.length);
        System.out.println("Vendors:");
        for(int index=0;index<fiber1.vendors.length;index++) 
		{
            System.out.println(fiber1.vendors[index]);
        }

		
        Fiber fiber2 = new Fiber();
		
        fiber2.name = "Plastic Fiber";
        fiber2.length = 250.0;
        fiber2.vendors = new String[]{"Local Supplier", "TechFiber"};

        System.out.println("---- Fiber 2 Details ----");
        System.out.println("Name: " + fiber2.name);
        System.out.println("Length: " + fiber2.length);
        System.out.println("Vendors:");
        for(int index=0;index<fiber2.vendors.length;index++) 
		{
            System.out.println(fiber2.vendors[index]);
        }
    }
}