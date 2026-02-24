class PersonRunner
{
	public static void main(String[] args)
	{
		String name="Adhya K R";
		String[] emails={"adhyaravigowda@gmail.com","adhyakr22@gmail.com"};
		long[] mobileNumbers={6364817378L,9945283474L};
		String address="Shivamogga";
		
		Person.contactInfo(name,emails,mobileNumbers,address);
		
		String dish="Cheesy Garlic Bread";
		String[] ingredients={"Garlic","Cheese","Chilli flakes","Bread"};
		
		Person.foodDish(dish,ingredients);
		
		String laptop="Acer";
		String model="Swift GO14";
		String[] ports={"HDMI","Type-C","USB"};
		String[] countries={"USA","India","Sweden","Switzerland","Russia"};
		
		Person.laptop(laptop,model,ports,countries);
	}
	
}