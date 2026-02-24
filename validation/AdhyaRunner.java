class AdhyaRunner
{
	public static void main(String[] args)
	{
		Adhya.info("Adhya",21,174);
		Adhya.info(null,21,174);
		Adhya.info("Adhya",-8,174);
		
		System.out.println();
		
		Adhya.familyInfo("Ravindra","Annapurna",true);
		Adhya.familyInfo(null,"Annapurna",true);
	}
}