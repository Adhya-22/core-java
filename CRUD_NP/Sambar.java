class Sambar
{
    int cookingTime;
    String preperationType;
    String cookingMethod;
    int numberOfServings;
    String difficultyLevel;
    boolean requiresSoaking;
	
	Sambar(int cookingTime,String preperationType,String cookingMethod,int numberOfServings,String difficultyLevel,boolean requiresSoaking)
	{
		this.cookingTime=cookingTime;
		this.preperationType=preperationType;
		this.cookingMethod=cookingMethod;
		this.numberOfServings=numberOfServings;
		this.difficultyLevel=difficultyLevel;
		this.requiresSoaking=requiresSoaking;
	}
	
	void printInfo()
	{
		System.out.println("Executing printInfo in Sambar..");
		System.out.println("cookingTime : "+this.cookingTime);
		System.out.println("preperationType : "+this.preperationType);
		System.out.println("cookingMethod : "+this.cookingMethod);
		System.out.println("numberOfServings : "+this.numberOfServings);
		System.out.println("difficultyLevel : "+this.difficultyLevel);
		System.out.println("requiresSoaking : "+this.requiresSoaking);
	}
}