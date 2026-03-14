package arrayProgram;

public class _07MaximumElement 
{
	public static int MinElement(int[] arr)
	{
		int Max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>Max)
			{
				Max=arr[i];
			}
		}
		return Max;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {68,50,47,25,17,39,91,21};
		System.out.println(MinElement(arr));
		
	}

}
