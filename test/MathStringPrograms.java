class MathStringPrograms
{
	static void reverseString(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	static void isPalindrome(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
			System.out.println("The Given string is Palindrome");
		else
			System.out.println("The given string is not a Palindrome");
	}
	
	static void fibonocci(int length)
	{
		int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < length; i++) 
		{
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
		}
		
		System.out.println();
		}
	
	 static void checkArmstrong(int num) 
	 {
        int original=num;
        int sum=0;
        int digits=0;
        int temp=num;

        while(temp!=0)
		{
            digits++;
            temp/=10;
        }
		
        temp=num;
        while(temp!=0) 
		{
            int digit=temp%10;
            sum+= Math.pow(digit,digits);
            temp/=10;
        }
		
        if (sum==original) 
		{
            System.out.println(original+" is Armstrong");
        } 
		else 
		{
            System.out.println(original+" is Not Armstrong");
        }
    }
	
	static void factorial(int n)
	{
		long fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		
		System.out.println(fact);
	}
	


}