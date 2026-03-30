class PartyBalloon extends Balloon
{
    String eventName;
    int quantity;
	boolean popable;
    String ribbonColor;
    boolean glowInDark;

    PartyBalloon()
	{
        System.out.println("Non-parameterized constructor of PartyBalloon");
    }

    void arrange()
	{
        System.out.println("Executing arrange in PartyBalloon");
    }
}