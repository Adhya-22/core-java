package arrayProgram;

import java.util.Arrays;

public class _15SwapElements 
{
	public static void SwapElements(int[] arr,int i,int j)
	{
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
//	public static void display(int[] arr)
//	{
//		for(int i=0;i<arr.length;i++)               //builtIn for printing array is
//		{                                        //toString method of Arrays class prsent in java.util pack
//			System.out.println(arr[i]);
//		}
//		
//	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {1,5,4,3,7,9,11,16};
		int i=2;
		int j=6;
		System.out.println(Arrays.toString(arr));
		SwapElements(arr,i,j);
//		display(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
