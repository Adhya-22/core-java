class BagRunner
{
	public static void main(String[] args)
	{
		Bag bag1=new Bag();
		System.out.println("Bag 1 noOfCompartment : "+bag1.noOfCompartment);
		System.out.println("Bag 1 Brand : "+bag1.brand);
		System.out.println("Bag 1 type : "+bag1.type);
		System.out.println("Bag 1 capacity : "+bag1.capacity);
		bag1.capacity=5;
		bag1.type="School";
		bag1.noOfCompartment=5;
		bag1.brand="Safari";
		System.out.println("After Update :");
		System.out.println("Bag 1 noOfCompartment : "+bag1.noOfCompartment);
		System.out.println("Bag 1 brand : "+bag1.brand);
		System.out.println("Bag 1 type : "+bag1.type);
		System.out.println("Bag 1 capacity : "+bag1.capacity);
		
		Bag bag2=new Bag();
		System.out.println("Bag 2 noOfCompartment : "+bag2.noOfCompartment);
		System.out.println("Bag 2 brand : "+bag2.brand);
		System.out.println("Bag 1 type : "+bag2.type);
		System.out.println("Bag 1 capacity : "+bag2.capacity);
		bag2.capacity=8;
		bag2.type="Tote";
		bag2.noOfCompartment=5;
		bag2.brand="gucci";
		System.out.println("After Update :");
		System.out.println("Bag 2 noOfCompartment : "+bag2.noOfCompartment);
		System.out.println("Bag 2 brand : "+bag2.brand);
		System.out.println("Bag 1 type : "+bag2.type);
		System.out.println("Bag 1 capacity : "+bag2.capacity);
		
		Bag bag3=new Bag();
		System.out.println("Bag 3 noOfCompartment : "+bag3.noOfCompartment);
		System.out.println("Bag 3 brand : "+bag3.brand);
		System.out.println("Bag 1 type : "+bag3.type);
		System.out.println("Bag 1 capacity : "+bag3.capacity);
		bag3.capacity=25;
		bag3.type="Travel";
		bag3.noOfCompartment=6;
		bag3.brand="tory";
		System.out.println("After Update :");
		System.out.println("Bag 3 noOfCompartment : "+bag3.noOfCompartment);
		System.out.println("Bag 3 brand : "+bag3.brand);
		System.out.println("Bag 1 type : "+bag3.type);
		System.out.println("Bag 1 capacity : "+bag3.capacity);
		
		Bag bag4=new Bag();
		System.out.println("Bag 4 noOfCompartment : "+bag4.noOfCompartment);
		System.out.println("Bag 4 brand : "+bag4.brand);
		System.out.println("Bag 1 type : "+bag4.type);
		System.out.println("Bag 1 capacity : "+bag4.capacity);
		bag4.capacity=5;
		bag4.type="School";
		bag4.noOfCompartment=4;
		bag4.brand="coach";
		System.out.println("After Update :");
		System.out.println("Bag 4 noOfCompartment : "+bag4.noOfCompartment);
		System.out.println("Bag 4 brand : "+bag4.brand);
		System.out.println("Bag 1 type : "+bag4.type);
		System.out.println("Bag 1 capacity : "+bag4.capacity);
		
		Bag bag5=new Bag();
		System.out.println("Bag 5 noOfCompartment : "+bag5.noOfCompartment);
		System.out.println("Bag 5 brand : "+bag5.brand);
		System.out.println("Bag 1 type : "+bag5.type);
		System.out.println("Bag 1 capacity : "+bag5.capacity);
		bag5.capacity=5;
		bag5.type="Tote";
		bag5.noOfCompartment=3;
		bag5.brand="michael";
		System.out.println("After Update :");
		System.out.println("Bag 5 noOfCompartment : "+bag5.noOfCompartment);
		System.out.println("Bag 5 brand : "+bag5.brand);
		System.out.println("Bag 1 type : "+bag5.type);
		System.out.println("Bag 1 capacity : "+bag5.capacity);
		
	}
	
}