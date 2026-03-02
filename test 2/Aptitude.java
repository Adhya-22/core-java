import java.util.Arrays;

class Aptitude
{
	int[] SumOfEvenAndOddInArray(int arr[])
	{
		int evenSum=0;
		int oddSum=0;
		
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]%2==0)
				evenSum+=arr[index];
			else
				oddSum+=arr[index];
		}
		
		return new int[]{evenSum,oddSum};
	}
	
	String ReverseString(String message)
	{
		String reverse="";
		
		for(int i=message.length()-1;i>=0;i--)
		{
			reverse+=message.charAt(i);
		}
		
		return reverse;
	}
	
	void isPalindrome(int num)
	{
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		
		if(rev==temp)
			System.out.println("The given number is a Palindrome.");
		else
			System.out.println("The given number is not a Palindrome.");
	}
	
	int sumOfArray(int[] arr)
	{
		int sum=0;
		for(int index=0;index<arr.length;index++)
			sum+=arr[index];
		
		return sum;
	}
}