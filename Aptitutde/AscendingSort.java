class AscendingSort 
{
	static void ascendingSort(int[] arr)
	{
		System.out.println("Array before sort:");
        for (int num:arr) 
		{
            System.out.print(num+" ");
        }
		System.out.println("\n");
		
		for(int i=0;i<arr.length;i++)
		{
            for(int j=i+1;j<arr.length;j++)
			{
                if(arr[i]>arr[j])
				{
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Array in ascending order:");
        for(int num:arr)
		{
            System.out.print(num+" ");
        }
	}
	
    public static void main(String[] args)
	{
        int[] arr = {5, 2, 8, 1, 9};

		ascendingSort(arr);
        
    }
}