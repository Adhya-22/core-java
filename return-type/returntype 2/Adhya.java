class Adhya
{
	static int getAge(String name)
	{
		System.out.println("Executing getAge in Adhya..");
		System.out.println("Name : "+name);
		
		if(name==null)
		{
			System.out.println("Name is invalid");
			return 0;
		}
		if(name=="Adhya")
		{
			return 21;
		}
		else if(name=="Harsha")
		{
			return 25;
		}
		else if(name=="Annapurna")
		{
			return 53;
		}
		else
		{
			System.out.println("Information unavailable..");
			return 0;
		}
	}
	
	static long[] getNumbers(String name)
	{
		System.out.println("Executing getNumbers in Adhya..");
		System.out.println("Name : "+name);
		
		if(name==null)
		{
			System.out.println("Name is invalid");
			return null;
		}
		
		if(name=="Adhya")
		{
			long[] adhyaNum={6364817378L};
			return adhyaNum;
		}
		else if(name=="Harsha")
		{
			long[] harshaNum={9886225768L};
			return harshaNum;
		}
		else if(name=="Annapurna")
		{
			long[] annapurnaNum={99445283474L,9480415952L};
			return annapurnaNum;
		}
		return null;
	}
	
	static String[] getEmails(String name)
	{
		System.out.println("Executing getEmails in Adhya..");
		System.out.println("Name : "+name);
		
		if(name==null)
		{
			System.out.println("Name is invalid");
			return null;
		}

		if(name=="Adhya")
		{
			String[] adhyaEmails={"adhyaravigowda@gmail.com","adhyakr22@gmail.com"};
		    return adhyaEmails;
		}
		else if(name=="Harsha")
		{
			String[] harshaEmails={"harsharavigowda@gmail.com"};
		    return harshaEmails;
		}
		else if(name=="Annapurna")
		{
			String[] annapurnaEmails={"annapurnaravi6572@gmail.com"};
			return annapurnaEmails;
		}
		 
		return null;
	}
	
}