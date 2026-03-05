class Bell
{
	String shape;
	boolean sonarity;
	String strength;
	boolean corrosionResistant;
	String primaryComposition;
	
	Handle handle;
	Metal metal;
	Striker striker;
	Stand stand;
	Sound sound;
	
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
	}
}