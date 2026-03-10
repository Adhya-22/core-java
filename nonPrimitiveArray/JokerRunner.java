class JokerRunner
{
	public static void main(String[] args)
	{
		String[] names={"Sathish","Ramesh","Ajay"};
		
		Circus circuses1=new Circus("Bombay");
		Circus circuses2=new Circus("Jumbo");
		Circus circuses3=new Circus("Gemini");
		
		Circus[] circuses={circuses1,circuses2,circuses3};
		
		Joker joker=new Joker(names,circuses);
		joker.getInfo();
	}
}