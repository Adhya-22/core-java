class Fort
{
	int height;
	Kingdom kingdom;
	Material material;
	
	Fort(int height,Kingdom kingdom,Material material)
	{
		this.height=height;
		this.kingdom=kingdom;
		this.material=material;
	}
	
	void printInfo()
	{
		System.out.println("Height : "+this.height);
		if(this.kingdom!=null)
		{
			System.out.println("Kingdom Name : "+kingdom.name);
		}
		System.out.println("Material : "+this.material);
	}
}