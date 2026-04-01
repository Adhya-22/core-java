class BlueWhaleRunner
{
	public static void main(String... args)
	{
		BabyWhale babyWhale1=new BabyWhale();
		System.out.println("heartSize : "+babyWhale1.heartSize);
		System.out.println("swimSpeed : "+babyWhale1.swimSpeed);
		System.out.println("isEndangered : "+babyWhale1.isEndangered);
		
		System.out.println();
		
		BabyWhale babyWhale2=new BabyWhale(200.2,30,true);
		System.out.println("heartSize : "+babyWhale2.heartSize);
		System.out.println("swimSpeed : "+babyWhale2.swimSpeed);
		System.out.println("isEndangered : "+babyWhale2.isEndangered);
		
		System.out.println();
		
		BabyWhale babyWhale3=new BabyWhale(true);
		System.out.println("heartSize : "+babyWhale3.heartSize);
		System.out.println("swimSpeed : "+babyWhale3.swimSpeed);
		System.out.println("isEndangered : "+babyWhale3.isEndangered);
	}
}