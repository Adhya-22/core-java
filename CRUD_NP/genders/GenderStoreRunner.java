class GenderStoreRunner
{
	public static void main(String[] args)
	{
		Gender[] genders=new Gender[3];
		
		GenderStore genderStore=new GenderStore(genders);
		
		genderStore.store(Gender.MALE);
		genderStore.store(Gender.FEMALE);
		genderStore.store(Gender.TRANS);
		
		genderStore.display();
		
		genderStore.sortAscendingOrder(genders);
		
		genderStore.display();
		
		genderStore.sortDescendingOrder(genders);
		
		genderStore.display();
		
	}
}