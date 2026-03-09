class Mushroom
{
	int quantity;      
    Farm farm;         
    MushroomType mushroomType; 

    Mushroom(int quantity,Farm farm,MushroomType mushroomType)
	{
		this.quantity=quantity;
		this.farm=farm;
		this.mushroomType=mushroomType;
	}
	
	void printInfo()
	{
		System.out.println("Mushroom quantity : "+this.quantity);
		if(this.farm!=null)
		{
			System.out.println("Farm size : "+farm.sizeInAcre);
		}
		System.out.println("Mushroom Type : "+this.mushroomType);
	}
}