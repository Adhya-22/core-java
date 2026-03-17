class StoreSteelPlantRunner
{
	public static void main(String[] args)
	{
		String[] names=new String[10];
		
		StoreSteelPlant storeSteelPlant=new StoreSteelPlant(names);
		
		storeSteelPlant.store("JSW Steel Ltd");
		storeSteelPlant.store("Tata Steel Ltd");
		storeSteelPlant.store("Steel Authority of India Ltd (SAIL)");
		storeSteelPlant.store("Jindal Steel & Power Ltd (JSPL)");
		storeSteelPlant.store("AM/NS India (ArcelorMittal Nippon Steel India)");
		storeSteelPlant.store("Jindal Stainless Ltd (JSL)");
		storeSteelPlant.store("Rashtriya Ispat Nigam Ltd");
		storeSteelPlant.store("Shyam Metalics and Energy Ltd");
		storeSteelPlant.store("Electrosteel Steels Ltd ");
		storeSteelPlant.store("Lloyds Metals & Energy Ltd");
		
		boolean found=storeSteelPlant.search("Jindal Stainless Ltd (JSL)");
		System.out.println("Steel plant name found : "+found);
		
		boolean update=storeSteelPlant.update(4,"Rashtriya Ispat Nigam Ltd");
		System.out.println("Updated ? : "+update);
		
		boolean update1=storeSteelPlant.update("Electrosteel Steels Ltd ","AM/NS India (ArcelorMittal Nippon Steel India)");
		System.out.println("Updated ? : "+update1);
		
		String delete=storeSteelPlant.delete(7);
		System.out.println("Deleted ? : "+delete);
		
		String delete1=storeSteelPlant.delete("Jindal Stainless Ltd (JSL)");
		System.out.println("Deleted ? : "+delete1);
	}
}