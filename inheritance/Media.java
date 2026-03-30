class Media
{
    String type;
    boolean isTrusted;
    boolean isApp;

    Media()
	{
        System.out.println("Non-parameterized constructor of Media");
    }

    void giveInfo()
	{
        System.out.println("Executing giveInfo in Media");
    }

    void takeInfo()
	{
        System.out.println("Executing takeInfo in Media");
    }
}