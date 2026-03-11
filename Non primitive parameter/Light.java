class Light
{
	boolean usingLed;
	
	Light(boolean usingLed)
	{
		this.usingLed=usingLed;
	}
	
	void getInfo()
	{
		System.out.println("usingLed : "+this.usingLed);
	}
}