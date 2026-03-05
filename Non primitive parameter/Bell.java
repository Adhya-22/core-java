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
}