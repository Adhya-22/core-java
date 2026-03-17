class PetroleumCompanyStoreRunner
{
	public static void main(String[] args)
	{
		String[] company=new String[5];
		
		PetroleumCompanyStore petroleumCompanyStore=new PetroleumCompanyStore(company);
		
		petroleumCompanyStore.store("Indian Oil Corporation Ltd");
		petroleumCompanyStore.store("Bharat Petroleum Corporation Ltd");
		petroleumCompanyStore.store("Hindustan Petroleum Corporation Ltd");
		petroleumCompanyStore.store("Oil India Limited");
		petroleumCompanyStore.store("Oil and Natural Gas Corporation");
		
		boolean found=petroleumCompanyStore.search("Oil India Limited");
		System.out.println("Company name found : "+found);
		
		boolean update=petroleumCompanyStore.update(1,"Oil India Limited");
		System.out.println("Updated ? : "+update);
		
		boolean update1=petroleumCompanyStore.update("Hindustan Petroleum Corporation Ltd","Oil and Natural Gas Corporation");
		System.out.println("Updated ? : "+update1);
		
		String delete=petroleumCompanyStore.delete(0);
		System.out.println("Deleted ? : "+delete);
		
		String delete1=petroleumCompanyStore.delete("Bharat Petroleum Corporation Ltd");
		System.out.println("Deleted ? : "+delete1);
	}
}