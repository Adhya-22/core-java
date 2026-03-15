package arrayProgram;

public class _14FindIndex 
{
	public static int FindIndex(int[] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {1,5,4,3,7,9,11,16};
		int key=12;
		System.out.println(FindIndex(arr,key));
		
	}

}
