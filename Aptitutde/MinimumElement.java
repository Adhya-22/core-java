package arrayProgram;

public class _04MinimumElement 
{
	public static int MinElement(int[] arr)
	{
		int Min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<Min)
			{
				Min=arr[i];
			}
		}
		return Min;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {68,50,47,25,17,39,11,21};
		System.out.println(MinElement(arr));
		
	}

}
