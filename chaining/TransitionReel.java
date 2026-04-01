class TransitionReel extends Reel
{
	TransitionReel()
	{
		super(230,3455,30);
		System.out.println("No-arg contructor in TransitionReel");
	}
	
	TransitionReel(int likes,int views,int shares)
	{
		super(likes,views,shares);
		System.out.println("int,int,int constructor in TransitionReel");
	}
	
	TransitionReel(int views)
	{
		super(120,views,100);
		System.out.println("int constructor in TransitionReel");
	}
}