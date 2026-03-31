class ComputerRunner
{
	public static void main(String... args)
	{
		Browser browser=new Browser();
		Computer computer=new Computer();
		computer.install(browser);
		
		System.out.println();
		
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		computer.install(chromeBrowser);         //Can use the reference of subClass type eventhough it is expecting superClass
		
		System.out.println();
		
		MobileChromeBrowser mobileBrowser=new MobileChromeBrowser();
		computer.install(mobileBrowser);       //can use reference of subClass Of subClass since it is in the heirarchy of Browser
		
		System.out.println();
		
		Browser browser2=new ChromeBrowser();
		computer.install(browser2);
		
		System.out.println();
		
		Browser browser3=new MobileChromeBrowser();
		computer.install(browser3);
		
		System.out.println();
		
		ChromeBrowser chromeBrowser2=new MobileChromeBrowser();
		computer.install(chromeBrowser2);
	}
}