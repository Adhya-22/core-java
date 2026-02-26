class Runner
{
	public static void main(String[] args)
	{
		MuseumCreator.getMuseum();
		MuseumCreator.getMuseum("National Museum");
		MuseumCreator.getMuseum("British Museum","London");
	
		ZooCreator.getZoo();
		ZooCreator.getZoo("Mysore zoo");
		ZooCreator.getZoo("Bannerghatta Zoo",180);
	
		StadiumCreator.getStadium();
		StadiumCreator.getStadium("Chinnaswamy Stadium");
		StadiumCreator.getStadium("Wankhede Stadium",33000);
	
	}

}