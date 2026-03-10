class Nail
{
	String material;
	
	Nail(String material)
	{
		this.material=material;
	}
	
	void display()
	{
		System.out.println("Executing display in Nail..");
		System.out.println("Nail material : "+this.material);
	}
}
