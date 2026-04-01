class GermanShepherdRunner
{
	public static void main(String... args)
	{
		Puppy puppy1=new Puppy();
		System.out.println("isTrained : "+puppy1.isTrained);
		System.out.println("jumpHeight : "+puppy1.jumpHeight);
		System.out.println("isTrainedForSearch : "+puppy1.isTrainedForSearch);
		
		System.out.println();
		
		Puppy puppy2=new Puppy(true,130,true);
		System.out.println("isTrained : "+puppy2.isTrained);
		System.out.println("jumpHeight : "+puppy2.jumpHeight);
		System.out.println("isTrainedForSearch : "+puppy2.isTrainedForSearch);
		
		System.out.println();
		
		Puppy puppy3=new Puppy(true);
		System.out.println("isTrained : "+puppy3.isTrained);
		System.out.println("jumpHeight : "+puppy3.jumpHeight);
		System.out.println("isTrainedForSearch : "+puppy3.isTrainedForSearch);
	}
}