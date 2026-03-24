class TollgateStoreRunner
{
	public static void main(String[] args)
	{
		Tollgate[] tollgates=new Tollgate[10];
		
		TollgateStore tollgateStore=new TollgateStore(tollgates);
		
		Tollgate tollgate1 = new Tollgate("Bangalore", "Car", 120.5, 300, true, true);
		tollgateStore.save(tollgate1);
		
		Tollgate tollgate2 = new Tollgate("Mysore", "Truck", 250.0, 150, true, false);
		tollgateStore.save(tollgate2);
		
		Tollgate tollgate3 = new Tollgate("Tumkur", "Bus", 200.0, 220, true, true);
		tollgateStore.save(tollgate3);
		
		Tollgate tollgate4 = new Tollgate("Hassan", "Car", 100.0, 400, true, true);
		tollgateStore.save(tollgate4);
		
		Tollgate tollgate5 = new Tollgate("Mandya", "Van", 180.0, 180, false, false);
		tollgateStore.save(tollgate5);
		
		Tollgate tollgate6 = new Tollgate("Chitradurga", "Truck", 300.0, 130, true, true);
		tollgateStore.save(tollgate6);
		
		Tollgate tollgate7 = new Tollgate("Davangere", "Car", 110.0, 350, true, false);
		tollgateStore.save(tollgate7);
		
		Tollgate tollgate8 = new Tollgate("Shimoga", "Bus", 210.0, 210, false, true);
		tollgateStore.save(tollgate8);
		
		Tollgate tollgate9 = new Tollgate("Hubli", "Truck", 275.0, 160, true, true);
		tollgateStore.save(tollgate9);
		
		Tollgate tollgate10 = new Tollgate("Belgaum", "Car", 130.0, 290, true, false);
		tollgateStore.save(tollgate10);
	}
}