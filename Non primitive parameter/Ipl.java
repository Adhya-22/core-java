class Ipl
{
	int seasons;
	int noOfTeams;
	String titleSponsor;
	boolean playOffs;
	boolean nightMatch;
	
	Team team;
	Trophy trophy;
	Player player;
	Stadium stadium;
	Umpire umpire;
	
	Ipl(int seasons,int noOfTeams,String titleSponsor,boolean playOffs,boolean nightMatch,Team team,
	Trophy trophy,Player player,Stadium stadium,Umpire umpire)
	{
		this.seasons=seasons;
		this.noOfTeams=noOfTeams;
		this.titleSponsor=titleSponsor;
		this.playOffs=playOffs;
		this.nightMatch=nightMatch;
		this.team=team;
		this.trophy=trophy;
		this.player=player;
		this.stadium=stadium;
		this.umpire=umpire;
	}
	
	void getInfo()
	{
		System.out.println("seasons : "+this.seasons);
		System.out.println("noOfTeams : "+this.noOfTeams);
		System.out.println("titleSponsor : "+this.titleSponsor);
		System.out.println("playOffs : "+this.playOffs);
		System.out.println("nightMatch : "+this.nightMatch);
	}
}


