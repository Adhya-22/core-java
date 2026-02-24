class CricketWorldCupRunner
{
	public static void main(String[] args)
	{
		CricketWorldCup.registerTeam("India","Rohit Sharma",1,true,15);
		CricketWorldCup.registerTeam("England",null,3,false,15);
		CricketWorldCup.registerTeam("Australia","Josh Hazelwood",0,false,15);
		
		CricketWorldCup.saveMatch(1234,"India","England","Wankhade","Mumbai","13th Feb","7:30 pm",20,true,"umpire1","umpire2");
		CricketWorldCup.saveMatch(1235,"England","Australia","Wankhade","Mumbai","16th Feb","7:30 pm",20,true,"umpire1","umpire2");
		CricketWorldCup.saveMatch(1236,"India","Australia","Wankhade","Mumbai","19th Feb","7:30 pm",20,true,"umpire1","umpire2");		
		
		CricketWorldCup.savePlayer("Virat Kohli","India",18,"Batsman",false,true,230,5000,4,86.4f,9.7f);
		CricketWorldCup.savePlayer("Dhoni","India",7,"Batsman/wicketKeeper",true,false,230,5000,4,86.4f,9.7f);
		CricketWorldCup.savePlayer("K L Rahul","India",22,"All rounder",false,false,230,5000,4,86.4f,9.7f);
		
		System.out.println(CricketWorldCup.calculateRunRate(345,20,5));
		System.out.println(CricketWorldCup.calculateRunRate(236,20,3));
		System.out.println(CricketWorldCup.calculateRunRate(328,20,9));
		
		System.out.println(CricketWorldCup.checkQualification(8,1.44f,2));
		System.out.println(CricketWorldCup.checkQualification(8,0,2));
		System.out.println(CricketWorldCup.checkQualification(6,1.44f,2));
		
		CricketWorldCup.manOfTheMatch("Virat Kohli",123,0);
		CricketWorldCup.manOfTheMatch("Rohit Sharma",105,0);
		CricketWorldCup.manOfTheMatch("Jasprith Bumrah",12,6);
		
	}
}