class Bell
{
	String shape;
	boolean sonarity;
	String strength;
	boolean corrosionResistant;
	String primaryComposition;
	
	Sound sound;
	Metal metal;
	Striker striker;
	Handle handle;
	Stand stand;
	
	
	Bell(String shape,boolean sonority,String strength,boolean corrosionResistant,String primaryComposition,
	Handle handle,Metal metal,Striker striker,Stand stand,Sound sound)
	{
		this.shape=shape;
		this.sonarity=sonarity;
		this.strength=strength;
		this.corrosionResistant=corrosionResistant;
		this.primaryComposition=primaryComposition;
		this.handle=handle;
		this.metal=metal;
		this.striker=striker;
		this.stand=stand;
		this.sound=sound;
	}
	
	void getInfo()
	{
		System.out.println("shape : "+this.shape);
		System.out.println("sonarity : "+this.sonarity);
		System.out.println("strength : "+this.strength);
		System.out.println("corrosionResistant : "+this.corrosionResistant);
		System.out.println("primaryComposition : "+this.primaryComposition);
		if(this.sound!=null)
		{
			this.sound.getInfo();
		}
		if(this.metal!=null)
		{
			this.metal.getInfo();
		}
		if(this.striker!=null)
		{
			this.striker.getInfo();
		}
		if(this.handle!=null)
		{
			this.handle.getInfo();
		}
		if(this.stand!=null)
		{
			this.stand.getInfo();
		}
	}
}