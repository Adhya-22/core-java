class GermanShepherd
{
	boolean isTrained;
	int jumpHeight;
    boolean isTrainedForSearch;
	
	GermanShepherd(boolean isTrained,int jumpHeight,boolean isTrainedForSearch)
	{
		System.out.println("boolean,int,boolean constructor in GermanShepherd");
		this.isTrained=isTrained;
		this.jumpHeight=jumpHeight;
		this.isTrainedForSearch=isTrainedForSearch;
	}
}