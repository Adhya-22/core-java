class Computer
{
	void install(Browser browser)
	{
		System.out.println("Executing install in Computer");
		if(browser!=null)
		{
			browser.open();
			if(browser instanceof ChromeBrowser)       //instanceof check whether the ref is pointing to instance memory of subClass
			{
				System.out.println("Reference is of ChromeBrowser type");
				ChromeBrowser chrome=(ChromeBrowser)browser;     //DownCasting ---> parent to child
				chrome.fastOpen();
			}
			if(browser instanceof MobileChromeBrowser)
			{
				System.out.println("Refernce is of MobileChromeBrowser type");
				MobileChromeBrowser mobileChrome=(MobileChromeBrowser)browser;
				mobileChrome.offline();
			}
		}
	}
}