class Carrom 
{
    String boardMaterial;
    double size;
    String strikerType;
    int numberOfCoins;
    boolean hasStand;
	
	Carrom()
	{
		System.out.println("No parameter constructor...");
	}
	
	Carrom(String boardMaterial)
	{
		this.boardMaterial=boardMaterial;
	}
	
	Carrom(String boardMaterial,double size)
	{
		this.boardMaterial=boardMaterial;
		this.size=size;
	}
	
	Carrom(String boardMaterial,double size,String strikerType)
	{
		this.boardMaterial=boardMaterial;
		this.size=size;
		this.strikerType=strikerType;
	}
	
	Carrom(String boardMaterial,double size,String strikerType,int numberOfCoins)
	{
		this.boardMaterial=boardMaterial;
		this.size=size;
		this.strikerType=strikerType;
		this.numberOfCoins=numberOfCoins;
	}
	
	Carrom(String boardMaterial,double size,String strikerType,int numberOfCoins,boolean hasStand)
	{
		this.boardMaterial=boardMaterial;
		this.size=size;
		this.strikerType=strikerType;
		this.numberOfCoins=numberOfCoins;
		this.hasStand=hasStand;
	}
}