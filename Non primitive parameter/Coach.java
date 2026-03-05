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
}