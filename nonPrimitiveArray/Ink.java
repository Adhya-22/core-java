class Ink
{
	String color;
	
	Ink(String color)
	{
		this.color=color;
	}
	
	void display()
	{
		Sytsem.out.println("Executing display in Ink..");
		System.out.println("Ink color : "+this.color);
	}
}