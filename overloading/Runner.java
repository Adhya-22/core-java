class Runner
{
	public static void main(String[] args)
	{
		BedSheet.info("cotton");
		BedSheet.info(2,"pink","linen");
		
		Charger.chargerInfo("Type-C");
		Charger.chargerInfo(5,"Micro-USB");
		
		Bowl.bowlInfo("Steel");
		Bowl.bowlInfo(4,"Ceramic");
		
		Suitcase.suitcaseInfo(9);
		Suitcase.suitcaseInfo("American Touristor",10);
		
		Dress.dressInfo("Jeans");
		Dress.dressInfo("Skirt",36,"Black");
	}
}