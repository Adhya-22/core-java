class LudoBoard extends GameBoard
{
    int players;
    String boardColor;
    int tokensPerPlayer;
	boolean diceIncluded;
    String theme;

    LudoBoard()
	{
        System.out.println("Non-parameterized constructor of LudoBoard");
    }

    void selectHouse()
	{
        System.out.println("Executing selectHouse in LudoBoard");
    }
}