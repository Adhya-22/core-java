class Coach
{
	String name;
	int experienceYears;
	double salary;
	boolean certified;
	boolean retired;
	
	Team team;
	Player player;
	Strategy strategy;
	TrainingSession trainingSession;
	Stadium stadium;
	
	Coach(String name,int experienceYears,double salary,boolean certified,boolean retired,Team team,
	Player player,Strategy strategy,TrainingSession trainingSession,Stadium stadium)
	{
		this.name=name;
		this.experienceYears=experienceYears;
		this.salary=salary;
		this.certified=certified;
		this.retired=retired;
		this.team=team;
		this.player=player;
		this.strategy=strategy;
		this.trainingSession=trainingSession;
		this.stadium=stadium;
	}
	
	void getInfo()
	{
		System.out.println("name : "+this.name);
		System.out.println("experienceYears : "+this.experienceYears);
		System.out.println("salary : "+this.salary);
		System.out.println("certified : "+this.certified);
		System.out.println("retired : "+this.retired);
		if(this.team!=null)
		{
			this.team.getInfo();
		}
		if(this.player!=null)
		{
			this.player.getInfo();
		}
		if(this.strategy!=null)
		{
			this.strategy.getInfo();
		}
		if(this.trainingSession!=null)
		{
			this.trainingSession.getInfo();
		}
		if(this.stadium!=null)
		{
			this.stadium.getInfo();
		}
	}
}