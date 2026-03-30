class SocialMedia extends Media 
{
    String appName;
    int users;
    String owner;
    int launchYear;
	boolean verifiedAccounts;

    SocialMedia()
	{
        System.out.println("Non-parameterized constructor of SocialMedia");
    }

    void post()
	{
        System.out.println("Executing post in SocialMedia");
    }
}