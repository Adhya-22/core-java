class FlavouredButter extends Butter
{
	
	FlavouredButter()
	{
		super(5,"Salted",true);
		System.out.println("No-arg contructor in FlavouredButter");
	}
	
	FlavouredButter(int selfLife,String flavour,boolean isVegan)
	{
		super(selfLife,flavour,isVegan);
		System.out.println("int,String,boolean constructor in FlavouredButter");
	}
	
	FlavouredButter(boolean isVegan)
	{
		super(7,"Garlic",isVegan);
		System.out.println("boolean constructor in FlavouredButter");
	}
}