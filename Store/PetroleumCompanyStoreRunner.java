class PetroleumCompanyStoreRunner
{
	public static void main(String[] args)
	{
		String[] company=new String[5];
		
		PetroleumCompanyStore petroleumCompanyStore=new PetroleumCompanyStore(company);
		
		petroleumCompanyStore.store("Indian Oil Corporation Ltd ");
		petroleumCompanyStore.store("Bharat Petroleum Corporation Ltd ");
		petroleumCompanyStore.store("Hindustan Petroleum Corporation Ltd ");
		petroleumCompanyStore.store("Oil India Limited ");
		petroleumCompanyStore.store("Oil and Natural Gas Corporation ");
	}
}