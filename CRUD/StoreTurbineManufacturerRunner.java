class StoreTurbineManufacturerRunner
{
	public static void main(String[] args)
	{
		String[] companies=new String[10];
		
		StoreTurbineManufacturer storeTurbineManufacturer=new StoreTurbineManufacturer(companies);
		
		storeTurbineManufacturer.store("Suzlon Energy Ltd.");
		storeTurbineManufacturer.store("Vestas Wind Technology India Pvt. Ltd.");
		storeTurbineManufacturer.store("Siemens Gamesa Renewable Energy Projects Pvt. Ltd.");
		storeTurbineManufacturer.store("Inox Wind Ltd.");
		storeTurbineManufacturer.store("Envision Energy India Pvt. Ltd.");
		storeTurbineManufacturer.store("GE Renewable Energy Technologies Pvt. Ltd.");
		storeTurbineManufacturer.store("Wind World India Ltd.");
		storeTurbineManufacturer.store("Enercon WindEnergy Pvt. Ltd.");
		storeTurbineManufacturer.store("Nordex India Manufacturing Pvt. Ltd.");
		storeTurbineManufacturer.store("Adani Wind");
		
		boolean found=storeTurbineManufacturer.search("Wind World India Ltd.");
		System.out.println("Turbine manufacturer name found : "+found);
		
		boolean update=storeTurbineManufacturer.update(5,"Siemens Gamesa Renewable Energy Projects Pvt. Ltd.");
		System.out.println("Updated ? : "+update);
		
		boolean update1=storeTurbineManufacturer.update("Enercon WindEnergy Pvt. Ltd.","Suzlon Energy Ltd.");
		System.out.println("Updated ? : "+update1);
		
		String delete=storeTurbineManufacturer.delete(3);
		System.out.println("Deleted ? : "+delete);
		
		String delete1=storeTurbineManufacturer.delete("Wind World India Ltd.");
		System.out.println("Deleted ? : "+delete1);
	}
}