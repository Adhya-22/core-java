class Puppy extends GermanShepherd
{
	Puppy()
	{
		super(false,60,false);
		System.out.println("No-arg contructor in Puppy");
	}
	
	Puppy(boolean isTrained,int jumpHeight,boolean isTrainedForSearch)
	{
		super(isTrained,jumpHeight,isTrainedForSearch);
		System.out.println("boolean,int,boolean constructor in Puppy");
	}
	
	Puppy(boolean isTrained)
	{
		super(isTrained,120,true);
		System.out.println("boolean constructor in Puppy");
	}
}