class CylinderCompanyStoreRunner
{
	public static void main(String[] args)
	{
		String[] company=new String[10];
		
		CylinderCompanyStore CylinderCompanyStore=new CylinderCompanyStore(company);
		
		CylinderCompanyStore.store("Everest Kanto Cylinder Ltd");
		CylinderCompanyStore.store("Rama Cylinders Pvt. Ltd.");
		CylinderCompanyStore.store("Lizer Cylinders Limited");
		CylinderCompanyStore.store("Bharat Petroleum Corporation Ltd (Bharat Gas)");
		CylinderCompanyStore.store("Indian Oil Corporation Ltd (Indane Gas)");
		CylinderCompanyStore.store("Reliance Gas");
		CylinderCompanyStore.store("Maharashtra Cylinders Pvt. Ltd");
		CylinderCompanyStore.store("Universal Cylinders Ltd");
		CylinderCompanyStore.store("Euro India Cylinders Limited");
		CylinderCompanyStore.store("Jay Fe Cylinders Ltd.");
		
		boolean found=CylinderCompanyStore.search("Jay Fe Cylinders Ltd.");
		System.out.println("Company name found : "+found);
	}
}