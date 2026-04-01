class BlueWhale
{
    double heartSize;
    int swimSpeed;
    boolean isEndangered;

    BlueWhale(double heartSize,int swimSpeed,boolean isEndangered)
	{
		System.out.println("double,int,boolean constructor in BlueWhale");
        this.heartSize = heartSize;
        this.swimSpeed = swimSpeed;
        this.isEndangered = isEndangered;
    }
}