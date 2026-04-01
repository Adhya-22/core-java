class ReelRunner
{
	public static void main(String... args)
	{
		TransitionReel transitionReel1=new TransitionReel();
		System.out.println("Likes : "+transitionReel1.likes);
		System.out.println("Views : "+transitionReel1.views);
		System.out.println("Shares : "+transitionReel1.shares);
		
		System.out.println();
		
		TransitionReel transitionReel2=new TransitionReel(40,200,13);
		System.out.println("Likes : "+transitionReel2.likes);
		System.out.println("Views : "+transitionReel2.views);
		System.out.println("Shares : "+transitionReel2.shares);
		
		System.out.println();
		
		TransitionReel transitionReel3=new TransitionReel(2000);
		System.out.println("Likes : "+transitionReel3.likes);
		System.out.println("Views : "+transitionReel3.views);
		System.out.println("Shares : "+transitionReel3.shares);
	}
}