class BreadRunner
{
	public static void main(String[] args) 
	{
        Bread bread1 = new Bread();
		
        bread1.type = "Whole Wheat";
        bread1.outletNames = new String[]{"More Supermarket", "DMart", "Local Bakery"};
        bread1.ingredients = new String[]{"Wheat Flour", "Water", "Salt", "Yeast"};
        bread1.shape = "Rectangular";
		
		System.out.println("---- Bread 1 Details ----");
        System.out.println("Type: " + bread1.type);
        System.out.println("Shape: " + bread1.shape);
        System.out.println("Outlet Names:");
        for(int index=0;index<bread1.outletNames.length;index++)
		{
            System.out.println(bread1.outletNames[index]);
        }
        System.out.println("Ingredients:");
        for(int index=0;index<bread1.ingredients.length;index++)
		{
            System.out.println(bread1.ingredients[index]);
        }


        Bread bread2 = new Bread();
		
        bread2.type = "Brown Bread";
        bread2.outletNames = new String[]{"Reliance Fresh", "Big Bazaar"};
        bread2.ingredients = new String[]{"Refined Flour", "Sugar", "Yeast", "Oil"};
        bread2.shape = "Square";

        System.out.println("---- Bread 2 Details ----");
        System.out.println("Type: " + bread2.type);
        System.out.println("Shape: " + bread2.shape);
        System.out.println("Outlet Names:");
        for(int index=0;index<bread2.outletNames.length;index++)
		{
            System.out.println(bread2.outletNames[index]);
        }
        System.out.println("Ingredients:");
        for(int index=0;index<bread2.ingredients.length;index++)
		{
            System.out.println(bread2.ingredients[index]);
        }
    }
}