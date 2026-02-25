class ChessBoardRunner
{
	public static void main(String[] args)
	{
		ChessBoard chessBoard1=new ChessBoard();
		
		ChessBoard chessBoard2=new ChessBoard("Wood");
		System.out.println("ChessBoard 2 info...");
		System.out.println("material : "+chessBoard2.material);
		
		ChessBoard chessBoard3=new ChessBoard("Plastic",10);
		System.out.println("ChessBoard 3 info...");
		System.out.println("material : "+chessBoard3.material);
		System.out.println("size : "+chessBoard3.size);
		
		ChessBoard chessBoard4=new ChessBoard("Marble",12,"WhiteBlack");
		System.out.println("ChessBoard 4 info...");
		System.out.println("material : "+chessBoard4.material);
		System.out.println("size : "+chessBoard4.size);
		System.out.println("colorPattern : "+chessBoard4.colorPattern);
		
		ChessBoard chessBoard5=new ChessBoard("Glass",8,"Transparent",2000);
		System.out.println("ChessBoard 5 info...");
		System.out.println("material : "+chessBoard5.material);
		System.out.println("size : "+chessBoard5.size);
		System.out.println("colorPattern : "+chessBoard5.colorPattern);
		System.out.println("price : "+chessBoard5.price);
		
		ChessBoard chessBoard6=new ChessBoard("Fiber",9,"RedBlack",1200,true);
		System.out.println("ChessBoard 6 info...");
		System.out.println("material : "+chessBoard6.material);
		System.out.println("size : "+chessBoard6.size);
		System.out.println("colorPattern : "+chessBoard6.colorPattern);
		System.out.println("price : "+chessBoard6.price);
		System.out.println("isFoldable : "+chessBoard6.isFoldable);

	}
}