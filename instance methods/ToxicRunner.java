class ToxicRunner
{
	public static void main(String[] args)
	{
		Toxic toxic1 = new Toxic("Sulfuric Acid","H2SO4","Liquid","Colorless","Odorless",1.84,337.0,10.0,
		"High","Cool Storage","Industrial",false,true,false,"ChemCorp","India","Gloves & Mask",
		"Low","Water Wash","Neutralization");
		toxic1.getInfo();

		Toxic toxic2 = new Toxic("Hydrochloric Acid","HCl","Liquid","Colorless","Sharp",1.19,110.0,-27.0,
		"Medium","Ventilated Area","Cleaning",false,true,false,"Chem Ltd","India","Protective Gear",
		"Moderate","Milk","Dilution");
		toxic2.getInfo();

		Toxic toxic3 = new Toxic("Ammonia","NH3","Gas","Colorless","Pungent",0.73,-33.0,-78.0,"High",
        "Sealed Tank","Fertilizer",true,false,false,"AgroChem","USA","Mask","Low","Fresh Air","Burning");
		toxic3.getInfo();

		Toxic toxic4 = new Toxic("Mercury","Hg","Liquid","Silver","None",13.5,357.0,-38.0,"Very High",
        "Closed Container","Thermometer",false,false,false,"MetalWorks","China","Gloves","Very Low",
		"Chelation","Hazard Facility");
		toxic4.getInfo();

		Toxic toxic5 = new Toxic("Chlorine","Cl2","Gas","Green","Strong",3.2,-34.0,-101.0,"High","Cylinder",
		"Water Treatment",false,true,false,"WaterChem","UK","Mask","Low","Oxygen","Neutralization");
		toxic5.getInfo();

		Toxic toxic6 = new Toxic("Carbon Monoxide","CO","Gas","Colorless","Odorless",1.14,-191.0,-205.0,
		"Very High","Closed Tank","Fuel Burning",true,false,false,"FuelCorp","USA","Detector","Very Low",
		"Oxygen","Ventilation");
		toxic6.getInfo();

		Toxic toxic7 = new Toxic("Benzene","C6H6","Liquid","Colorless","Sweet",0.87,80.0,5.5,"High",
        "Cool Area","Industrial",true,false,false,"ChemWorld","Germany","Mask","Low","Charcoal",
		"Incineration");
		toxic7.getInfo();

		Toxic toxic8 = new Toxic("Arsenic","As","Solid","Grey","None",5.7,613.0,817.0,"Extreme","Dry Storage",
		"Poison",false,true,false,"MineralCo","India","Gloves","Very Low","Dimercaprol","Secure Disposal");
		toxic8.getInfo();

		Toxic toxic9 = new Toxic("Lead","Pb","Solid","Grey","None",11.3,1749.0,327.0,"High","Dry Area",
		"Batteries",false,false,false,"Metal Ltd","India","Mask","Low","Chelation","Recycling");
		toxic9.getInfo();

		Toxic toxic10 = new Toxic("Uranium","U","Solid","Silver","None",19.1,4131.0,1132.0,"Extreme",
        "Shielded Storage","Nuclear",false,false,true,"NuclearCorp","USA","Radiation Suit","Very Low",
		"Medical Support","Hazard Facility");
		toxic10.getInfo();
	}
}