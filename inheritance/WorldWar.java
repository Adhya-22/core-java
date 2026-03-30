class WorldWar extends War
{
	int countriesInvolved;
	boolean ongoing;
    int yearStarted;
    int yearEnded;
    int totalDeaths;
	
	WorldWar()
	{
		System.out.println("Non-parameterized constructor of WorldWar");
	}
	
	void fight()
	{
		System.out.println("Executing fight in WorldWar");
	}
}