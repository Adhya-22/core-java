class SwapNumbers
{
	public static void main(String... args)
	{
		int num1=20;
		int num2=22;
		
		System.out.println("Before Swaping, num1 : "+num1+" num2 :"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swaping, num1 : "+num1+" num2 :"+num2);
	}
}