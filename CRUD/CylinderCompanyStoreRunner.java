class CylinderCompanyStoreRunner
{
	public static void main(String[] args)
	{
		String[] company=new String[10];
		
		CylinderCompanyStore cylinderCompanyStore=new CylinderCompanyStore(company);
		
		cylinderCompanyStore.store("Everest Kanto Cylinder Ltd");
		cylinderCompanyStore.store("Rama Cylinders Pvt. Ltd.");
		cylinderCompanyStore.store("Lizer Cylinders Limited");
		cylinderCompanyStore.store("Bharat Petroleum Corporation Ltd (Bharat Gas)");
		cylinderCompanyStore.store("Indian Oil Corporation Ltd (Indane Gas)");
		cylinderCompanyStore.store("Reliance Gas");
		cylinderCompanyStore.store("Maharashtra Cylinders Pvt. Ltd");
		cylinderCompanyStore.store("Universal Cylinders Ltd");
		cylinderCompanyStore.store("Euro India Cylinders Limited");
		cylinderCompanyStore.store("Jay Fe Cylinders Ltd.");
		
		boolean found=cylinderCompanyStore.search("Jay Fe Cylinders Ltd.");
		System.out.println("Company name found : "+found);
		
		boolean updated=cylinderCompanyStore.update(3,"HP");
		System.out.println("Company name updated ? : "+updated);
		
		boolean updated1=cylinderCompanyStore.update("Reliance Gas","HP");
		System.out.println("Company name updated ? : "+updated1);
		
		String delete=cylinderCompanyStore.delete(4);
		System.out.println("Deleted ? : "+delete);
		
		String delete1=cylinderCompanyStore.delete("Universal Cylinders Ltd");
		System.out.println("Deleted ? : "+delete1);
	}
}