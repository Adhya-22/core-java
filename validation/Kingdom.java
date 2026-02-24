class Kingdom
{
	static void save(boolean king,String name,String kingdomName,String queenName,String princessName,
	int populationOfKingdom,String territory,int yearOfBirth,int yearOfDeath,int armySize,int yearsRuled)
	{
		System.out.println("King : "+king+" Name : "+name+" KingdomName : "+kingdomName+" QueenName : "+queenName+
		" PrincessName : "+princessName+" Population : "+populationOfKingdom+" Territory : "+territory+" Yearofbirth"+
		yearOfBirth+" YearOfDeath : "+yearOfDeath+" Army Size : "+armySize+" Years Ruled : "+yearsRuled);
		
		if(king==true)
		{
			System.out.println("We are saving King...");
		}
		else
		{
			System.out.println("We are saving Queen...");
		}
		
		if(name==null)
		{
			System.out.println("Name is invalid...");
			return;
		}
		
		if(queenName==null)
		{
			System.out.println("QueenName is invalid...");
			return;
		}
		
		if(princessName==null)
		{
			System.out.println("PrincessName is invalid...");
			return;
		}
		
		if(populationOfKingdom>500000)
		{
			System.out.println("Population is invalid, Make sure it is less than 500000...");
			return;
		}
		
		if(territory==null)
		{
			System.out.println("Territory is invalid...");
			return;
		}
		
		if(yearOfBirth>2026)
		{
			System.out.println("Year of Birth is invalid, Make sure it is less than 2026 ...");
			return;
		}
		
		if(yearOfDeath<2026)
		{
			System.out.println("Year of Death is invalid, Make sure it is less than more than 2026...");
			return;
		}
		
		if(armySize>300000)
		{
			System.out.println("Army Size is invalid, Make sure it is less than 300000...");
			return;
		}
		
		if(yearsRuled<0)
	    {
			System.out.println("Years Ruled is invalid, Make sure it is more than 0...");
			return;
		}
		
		System.out.println("Kingdom Data is valid...");
	}
	
	static void saveArmy(int noOfSoldiers,int noOfElephants,int noOfHorses,int noOfWeapons,
	String commanderName,boolean commanderMarried,String commanderWifeName,boolean commanderIsFather,
	String commanderChildName,int commanderExperience) 
	{ 
		System.out.println("No of Soldiers : "+noOfSoldiers+" No of Elephants : "+noOfElephants+" No of Horses : "
		+noOfHorses+" No of Weapons : "+noOfWeapons+" Commander Name : "+commanderName+" Is commander Married : "
		+commanderMarried+" Commander Wife : "+commanderWifeName+" is Commander Father :"+commanderIsFather+
		" Commander Child : "+commanderChildName+" Commander Experience : "+commanderExperience);
		
		if(noOfSoldiers>300000)
		{
			System.out.println("No of Soldiers is invalid, Make sure it is less than 300000...");
			return;
		}
		
		if(noOfElephants>30)
		{
			System.out.println("No of Elephants is invalid, Make sure it is less than 30...");
			return;
		}
		
		if(noOfHorses>300)
		{
			System.out.println("No of Elephants is invalid, Make sure it is less than 300...");
			return;
		}
		
		if(noOfWeapons>30000)
		{
			System.out.println("No of Elephants is invalid, Make sure it is less than 30000...");
			return;
		}
		
		if(commanderName==null)
		{
			System.out.println("Commander Name is invalid...");
			return;
		}
		
		if(commanderMarried==true)
		{
			System.out.println("Commander is Married..");
			if(commanderWifeName==null)
			{
				System.out.println("Commander Wife name is invalid...");
				return;
			}
			if(commanderIsFather==true)
			{
				System.out.println("Commander is a Father...");
				if(commanderChildName==null)
				{
					System.out.println("Commander Child name is invalid...");
					return;
				}
			}
		}
		
		if(commanderExperience<0)
		{
			System.out.println("Commander Experience is invalid...");
			return;
		}
		
		System.out.println("Commander Info is valid...");
	}
}