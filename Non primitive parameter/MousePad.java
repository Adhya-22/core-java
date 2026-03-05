class MousePad
{
	String surfaceType;
	
	MousePad(String surfaceType)
	{
		this.surfaceType=surfaceType;
	}
	
	void getInfo()
	{
		System.out.println("surfaceType : "+this.surfaceType);
	}
}