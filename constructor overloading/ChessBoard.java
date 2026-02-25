class ChessBoard 
{
    String material;
    int size;
    String colorPattern;
    double price;
    boolean isFoldable;
	
	ChessBoard()
	{
		System.out.println("No parameter constructor...");
	}
	
	ChessBoard(String material)
	{
		this.material=material;
	}
	
	ChessBoard(String material,int size)
	{
		this.material=material;
		this.size=size;
	}
	
	ChessBoard(String material,int size,String colorPattern)
	{
		this.material=material;
		this.size=size;
		this.colorPattern=colorPattern;
	}
	
	ChessBoard(String material,int size,String colorPattern,double price)
	{
		this.material=material;
		this.size=size;
		this.colorPattern=colorPattern;
		this.price=price;
	}
	
	ChessBoard(String material,int size,String colorPattern,double price,boolean isFoldable)
	{
		this.material=material;
		this.size=size;
		this.colorPattern=colorPattern;
		this.price=price;
		this.isFoldable=isFoldable;
	}
}