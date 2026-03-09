class Court
{
	int cases;
	CourtCase courtCase; 
	CourtLevel courtLevel;
	
	Court(int cases,CourtCase courtCase,CourtLevel courtLevel)
	{
		this.cases=cases;
		this.courtCase=courtCase;
		this.courtLevel=courtLevel;
	}
	
	void printInfo()
	{
		System.out.println("Number of cases : "+this.cases);
		if(this.courtCase!=null)
		{
			System.out.println("Case type : "+courtCase.type);
		}
		System.out.println("Court Level : "+this.courtLevel);
	}
}