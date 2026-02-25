class PawnRunner
{
	public static void main(String[] args)
	{
		Pawn pawn1=new Pawn();
		
		Pawn pawn2=new Pawn("White");
		System.out.println("Pawn 2 info...");
		System.out.println("color : "+pawn2.color);
		
		Pawn pawn3=new Pawn("Black","Plastic");
		System.out.println("Pawn 3 info...");
		System.out.println("color : "+pawn3.color);
		System.out.println("material : "+pawn3.material);
		
		Pawn pawn4=new Pawn("White","Marble",6);
		System.out.println("Pawn 4 info...");
		System.out.println("color : "+pawn4.color);
		System.out.println("material : "+pawn4.material);
		System.out.println("height : "+pawn4.height);
		
		Pawn pawn5=new Pawn("Black","Metal",5,22);
		System.out.println("Pawn 5 info...");
		System.out.println("color : "+pawn5.color);
		System.out.println("material : "+pawn5.material);
		System.out.println("height : "+pawn5.height);
		System.out.println("weight : "+pawn5.weight);
		
		Pawn pawn6=new Pawn("White","Fiber",4,15,true);
		System.out.println("Pawn 6 info...");
		System.out.println("color : "+pawn6.color);
		System.out.println("material : "+pawn6.material);
		System.out.println("height : "+pawn6.height);
		System.out.println("weight : "+pawn6.weight);
		System.out.println("isPromoted : "+pawn6.isPromoted);

	}
}