class SocialMediaRunner
{
    public static void main(String... args)
	{
        SocialMedia socialMedia1=new SocialMedia();
        socialMedia1.type="Online";
        socialMedia1.isTrusted=true;
        socialMedia1.isApp=true;
        socialMedia1.appName="Instagram";
        socialMedia1.users=500000;
        socialMedia1.owner="Meta";
        socialMedia1.launchYear=2010;
        socialMedia1.verifiedAccounts=true;
        socialMedia1.giveInfo();
        socialMedia1.takeInfo();
        socialMedia1.post();

        SocialMedia socialMedia2=new SocialMedia();
        socialMedia2.type="Online";
        socialMedia1.isTrusted=true;
        socialMedia2.isApp=true;
        socialMedia2.appName="Twitter";
        socialMedia2.users=300000;
        socialMedia2.owner="X Corp";
        socialMedia2.launchYear=2006;
        socialMedia2.verifiedAccounts=false;
        socialMedia2.giveInfo();
        socialMedia2.takeInfo();
        socialMedia2.post();

        Media media1=new SocialMedia();
        media1.type="Digital";
        media1.isTrusted=true;
        media1.isApp=true;
        media1.giveInfo();
        media1.takeInfo();

        Media media2=new SocialMedia();
        media2.type="Hybrid";
        media1.isTrusted=true;
        media2.isApp=false;
        media2.giveInfo();
        media2.takeInfo();

        Media media3=new Media();
        media3.type="Print";
        media1.isTrusted=true;
        media3.isApp=false;
        media3.giveInfo();
        media3.takeInfo();

        Media media4=new Media();
        media4.type="Radio";
        media1.isTrusted=true;
        media4.isApp=false;
        media4.giveInfo();
        media4.takeInfo();
    }
}