class CricketWorldCup
{
	static void registerTeam(String teamName,String captainName,int ranking,boolean isHost,int squadSize)
	{
		System.out.println("Team Name : "+teamName+" Captain Name : "+captainName+" Ranking : "+ranking+" isHost : "
		+isHost+" Squad Size : "+squadSize);
		
		if(teamName==null)
		{
			System.out.println("Team Name INVALID");
			return;
		}
		if(captainName==null)
		{
			System.out.println("Captain Name INVALID");
			return;
		}
		if(ranking<=0)
		{
			System.out.println("Ranking INVALID");
			return;
		}
		if(squadSize<11)
		{
			System.out.println("Squad Size INVALID");
			return;
		}
		System.out.println("Team registeration is VALID");
	}
	
	static void saveMatch(int matchId,String team1,String team2,String venue,String city,String date,String time,
	int overs,boolean isDayNight,String umpire1,String umpier2)
	{
		System.out.println("Match ID : "+matchId+" Team 1 : "+team1+" Team 2 : "+team2+" Venue : "+venue+" Date :"+
		date+" Time : "+time+" Overs : "+overs+" Is is it a night match :"+isDayNight+" Umpire 1 : "+umpire1+" Umpire 2 : "+umpier2);
		
		if(matchId<0)
		{
			System.out.println("Match ID INVALID");
			return;
		}
		if(team1==null)
		{
			System.out.println("Team 1 Name INVALID");
			return;
		}
		if(team2==null)
		{
			System.out.println("Team 2 Name INVALID");
			return;
		}
		if(venue==null)
		{
			System.out.println("Venue INVALID");
			return;
		}
		if(city==null)
		{
			System.out.println("City INVALID");
			return;
		}
		if(date==null)
		{
			System.out.println("Date INVALID");
			return;
		}
		if(time==null)
		{
			System.out.println("Time INVALID");
			return;
		}
		if(overs<=0)
		{
			System.out.println("Overs INVALID");
			return;
		}
		if(umpire1==null)
		{
			System.out.println("Umpire 1 INVALID");
			return;
		}
		if(umpier2==null)
		{
			System.out.println("Umpire 2 INVALID");
			return;
		}
		System.out.println("Match Info VALID");
	}
	
	static void savePlayer(String playerName,String teamName,int jerseyNumber,String role,boolean isCaptain,
	boolean isViceCaptain,int matchesPlayed,int runsScored,int wicketsTaken,float battingAverage,float bowlingEconomy)
	{
		System.out.println("Player Name : "+playerName+" Team Name : "+teamName+" Jersey Number : "+jerseyNumber
		+" Role : "+role+" isCaptain : "+isCaptain+" isViceCaptain : "+isViceCaptain+" Matches Played : "+matchesPlayed
		+" Runs Scored : "+runsScored+" Wickects Taken : "+wicketsTaken+" Batting Average : "+battingAverage+
		" Bowling Economy : "+bowlingEconomy);
		
		if(playerName==null)
		{
			System.out.println("Player Name INVALID");
			return;
		}
		if(teamName==null)
		{
			System.out.println("Team Name INVALID");
			return;
		}
		if(jerseyNumber<0)
		{
			System.out.println("Jersey Number INVALID");
			return;
		}
		if(role==null)
		{
			System.out.println("Role INVALID");
			return;
		}
		if(matchesPlayed<0)
		{
			System.out.println("Matches Played INVALID");
			return;
		}
		if(runsScored<0)
		{
			System.out.println("Runs Scored INVALID");
			return;
		}
		if(wicketsTaken<0)
		{
			System.out.println("Wickets Taken INVALID");
			return;
		}
		if(battingAverage<0)
		{
			System.out.println("Batting Average INVALID");
			return;
		}
		if(bowlingEconomy<0)
		{
			System.out.println("Bowling Economy INVALID");
			return;
		}
		System.out.println("Player Info is VALID");
	}
	
	static float calculateRunRate(int totalRuns,int oversFaced,int wicketlost)
	{
		System.out.println("Total Runs : "+totalRuns+" Overs Faced : "+oversFaced+" Wickects lost : "+wicketlost);
		if(totalRuns<0)
		{
			System.out.println("totalRuns INVALID");
			return 0.0f;
		}
		if(oversFaced<=0)
		{
			System.out.println("oversFaced INVALID");
			return 0.0f;
		}
		if(wicketlost<0)
		{
			System.out.println("wicketlost INVALID");
			return 0.0f;
		}
		int balls=6*oversFaced;
		float runRate=totalRuns%balls;
		return runRate;
	}
	
	static boolean checkQualification(int points,float netRunRate,int matchesLeft)
	{
		System.out.println("Points : "+points+" NetRunRate : "+netRunRate+" matchesLeft : "+matchesLeft);
		
		if(points<8)
		{
			System.out.println("points INVALID");
			return false;
		}
		if(matchesLeft<0)
		{
			System.out.println("matchesLeft INVALID");
			return false;
		}
		
		if(points>8 && netRunRate>0)
			System.out.println("Qualified...");
		
		return true;
	}
	
	static void manOfTheMatch(String playerName,int runs,int wickets)
	{
		System.out.println("Player Name : "+playerName+" Runs : "+runs+" wickets : "+wickets);
		if(playerName==null)
		{
			System.out.println("Player Name INVALID");
			return;
		}
		if(runs<0)
		{
			System.out.println("Runs INVALID");
			return;
		}
		if(wickets<0)
		{
			System.out.println("Wickets INVALID");
			return;
		}
	}
	
}