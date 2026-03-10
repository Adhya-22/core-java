class Brush
{
	String shape;
	
	Brush(String shape)
	{
		this.shape=shape;
	}
	
	void display()
	{
		System.out.println("Executing display in Brush..");
		System.out.println("Shape : "+this.shape);
	}
}