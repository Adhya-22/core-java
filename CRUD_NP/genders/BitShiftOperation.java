class BitShiftOperation
{
	public static void main(String... values)
	{
		int num=4;
		int shiftBy=1;
		
		int leftShiftNum=num<<shiftBy;
		int rightShiftNum=num>>shiftBy;
		
		System.out.println("Number before left Shift : "+num);
		System.out.println("Number after left Shift : "+leftShiftNum);
		System.out.println("Number before right Shift : "+num);
		System.out.println("Number before right Shift : "+rightShiftNum);
	}
}