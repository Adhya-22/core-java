class Bearing
{
	String material;
	
	Bearing(String material)
	{
		this.material=material;
	}
	
	void getInfo()
	{
		System.out.println("material : "+this.material);
	}
}