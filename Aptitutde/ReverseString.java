class ReverseString
{
	public static void main(String[] args)
	{
		String message="Hello";
		String reverse="";
		
		for(int i=message.length()-1;i>=0;i--)
		{
			reverse+=message.charAt(i);
		}
		System.out.println(reverse);
		
	}
}
