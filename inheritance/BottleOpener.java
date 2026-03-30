class BottleOpener extends Opener 
{
    int usageCount;
    String handleType;
    boolean lightweight;
	boolean multiPurpose;

    BottleOpener()
	{
        System.out.println("Non-parameterized constructor of BottleOpener");
    }

    void pull()
	{
        System.out.println("Executing pull in BottleOpener");
    }
}