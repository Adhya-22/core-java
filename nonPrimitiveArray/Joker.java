class Joker
{
	String[] names;
	Circus[] circuses;
	
	Joker(String[] names,Circus[] circuses)
	{
		this.names=names;
		this.circuses=circuses;
	}
	
	void getInfo()
	{
		System.out.println("Executing getInfo in Joker..");
		if(this.names!=null)
		{
			for(String name:names)
			{
				System.out.println("name : "+name);
			}
		}
		if(this.circuses!=null)
		{
			System.out.println("total circuses : "+this.circuses.length);
			for(Circus circus:this.circuses)
			{
				circus.display();
			}
		}
	}
}