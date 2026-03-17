class StoreKettleBrandRunner
{
	public static void main(String[] args)
	{
		String[] brands=new String[10];
		
		StoreKettleBrand storeKettleBrand=new StoreKettleBrand(brands);
		
		storeKettleBrand.store("Fellow");
		storeKettleBrand.store("Breville");
		storeKettleBrand.store("Smeg");
		storeKettleBrand.store("KitchenAid");
		storeKettleBrand.store("OXO Brew");
		storeKettleBrand.store("Zwilling");
		storeKettleBrand.store("Philips");
		storeKettleBrand.store("Prestige");
		storeKettleBrand.store("Havells");
		storeKettleBrand.store("Bajaj");
		
		boolean found=storeKettleBrand.search("Bajaj");
		System.out.println("Kettle brand name found : "+found);
		
		boolean update=storeKettleBrand.update(4,"Havells");
		System.out.println("Updated ? : "+update);
		
		boolean update1=storeKettleBrand.update("Zwilling","OXO Brew");
		System.out.println("Updated ? : "+update1);
		
		String delete=storeKettleBrand.delete(0);
		System.out.println("Deleted ? : "+delete);
		
		String delete1=storeKettleBrand.delete("Smeg");
		System.out.println("Deleted ? : "+delete1);
	}
}