class ScrollWheel
{
	boolean worksAsButton;
	
	ScrollWheel(boolean worksAsButton)
	{
		this.worksAsButton=worksAsButton;
	}
	
	void getInfo()
	{
		System.out.println("worksAsButton : "+this.worksAsButton);
	}
}