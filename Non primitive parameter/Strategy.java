class Strategy
{
	boolean futureOriented;
	
	Strategy(boolean futureOriented)
	{
		this.futureOriented=futureOriented;
	}
	
	void getInfo()
	{
		System.out.println("futureOriented : "+this.futureOriented);
	}
}