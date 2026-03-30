class GameBoard
{
    String material;
    int size;
    boolean foldable;

    GameBoard()
	{
        System.out.println("Non-parameterized constructor of GameBoard");
    }

    void start()
	{
        System.out.println("Executing start in GameBoard");
    }

    void stop() {
        System.out.println("Executing stop in GameBoard");
    }
}