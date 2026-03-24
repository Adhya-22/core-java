class FarmerStoreRunner
{
	public static void main(String[] args)
	{
		Farmer[] farmers=new Farmer[10];
		
		FarmerStore farmerStore=new FarmerStore(farmers);
		
		Farmer farmer1=new Farmer(5,"Rice",2.5,1500,true,true);
		farmerStore.save(farmer1);
		
		Farmer farmer2=new Farmer(3,"Wheat",3,1200,false,true);
		farmerStore.save(farmer2);
		
		Farmer farmer3=new Farmer(8,"Sugarcane",5.5,3000,true,true);
		farmerStore.save(farmer3);
		
		Farmer farmer4=new Farmer(2,"Maize",1.8,900,false,false);
		farmerStore.save(farmer4);
		
		Farmer farmer5=new Farmer(6,"Cotton",4.0,2000,true,false);
		farmerStore.save(farmer5);
		
		Farmer farmer6=new Farmer(4,"Ragi",2.2,1100,false,true);
		farmerStore.save(farmer6);
		
		Farmer farmer7=new Farmer(7,"Pulses",3.5,1400,true,true);
		farmerStore.save(farmer7);
		
		Farmer farmer8=new Farmer(1,"Vegetables",1,800,false,true);
		farmerStore.save(farmer8);
		
		Farmer farmer9=new Farmer(9,"Barley",4.8,1700,true,false);
		farmerStore.save(farmer9);
		
		Farmer farmer10=new Farmer(10,"Groundnut",6,2500,true,true);
		farmerStore.save(farmer10);
	}
}