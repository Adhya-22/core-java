class LudoBoardRunner
{
    public static void main(String... args)
	{
        LudoBoard ludoBoard1=new LudoBoard();
        ludoBoard1.material="Plastic";
        ludoBoard1.size=30;
        ludoBoard1.foldable=true;
        ludoBoard1.players=4;
        ludoBoard1.boardColor="Multicolor";
        ludoBoard1.tokensPerPlayer=4;
        ludoBoard1.diceIncluded=true;
        ludoBoard1.theme="Classic";
        ludoBoard1.start();
        ludoBoard1.stop();
        ludoBoard1.selectHouse();

        LudoBoard ludoBoard2=new LudoBoard();
        ludoBoard2.material="Wood";
        ludoBoard2.size=40;
        ludoBoard2.foldable=false;
        ludoBoard2.players=2;
        ludoBoard2.boardColor="Red & Blue";
        ludoBoard2.tokensPerPlayer=6;
        ludoBoard2.diceIncluded=true;
        ludoBoard2.theme="Premium";
        ludoBoard2.start();
        ludoBoard2.stop();
        ludoBoard2.selectHouse();

        GameBoard gameBoard1=new LudoBoard();
        gameBoard1.material="Cardboard";
        gameBoard1.size=25;
        gameBoard1.foldable=true;
        gameBoard1.start();
        gameBoard1.stop();
		
        GameBoard gameBoard2=new LudoBoard();
        gameBoard2.material="Fiber";
        gameBoard2.size=35;
        gameBoard2.foldable=false;
        gameBoard2.start();
        gameBoard2.stop();

        GameBoard gameBoard3=new GameBoard();
        gameBoard3.material="Paper";
        gameBoard3.size=20;
        gameBoard3.foldable=true;
        gameBoard3.start();
        gameBoard3.stop();

        GameBoard gameBoard4=new GameBoard();
        gameBoard4.material="Metal";
        gameBoard4.size=45;
        gameBoard4.foldable=false;
        gameBoard4.start();
        gameBoard4.stop();
    }
}