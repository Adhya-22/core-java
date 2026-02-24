class BunRunner
{
	public static void main(String[] args) 
	{
        Bun bun1 = new Bun();

        bun1.name = "Milk Bun";
        bun1.flavor = "Vanilla";
        bun1.price = 25.5;
        bun1.weight = 100.0;
        bun1.shape = "Round";
        bun1.isSweet = true;
        bun1.brand = "SweetBake";
        bun1.calories = 250;
        bun1.color = "Golden";
        bun1.expiryDate = "25-02-2026";
        bun1.ingredients = new String[]{"Flour", "Milk", "Sugar", "Yeast"};
        bun1.ratings = new int[]{4, 5, 5};
		
        System.out.println("---- Bun 1 Details ----");
        System.out.println(bun1.name);
        System.out.println(bun1.flavor);
        System.out.println(bun1.price);
        System.out.println(bun1.weight);
        System.out.println(bun1.shape);
        System.out.println(bun1.isSweet);
        System.out.println(bun1.brand);
        System.out.println(bun1.calories);
        System.out.println(bun1.color);
        System.out.println(bun1.expiryDate);
        System.out.println("Ingredients:");
        for (int index=0;index<bun1.ingredients.length;index++)
		{
            System.out.println(bun1.ingredients[index]);
        }
        System.out.println("Ratings:");
        for (int index=0;index<bun1.ratings.length;index++) 
		{
            System.out.println(bun1.ratings[index]);
        }

        Bun bun2 = new Bun();
		
        bun2.name = "Burger Bun";
        bun2.flavor = "Plain";
        bun2.price = 30.0;
        bun2.weight = 120.0;
        bun2.shape = "Round";
        bun2.isSweet = false;
        bun2.brand = "FreshBake";
        bun2.calories = 300;
        bun2.color = "Light Brown";
        bun2.expiryDate = "28-02-2026";
        bun2.ingredients = new String[]{"Flour", "Water", "Salt", "Yeast"};
        bun2.ratings = new int[]{3, 4, 4};

        System.out.println("---- Bun 2 Details ----");
        System.out.println(bun2.name);
        System.out.println(bun2.flavor);
        System.out.println(bun2.price);
        System.out.println(bun2.weight);
        System.out.println(bun2.shape);
        System.out.println(bun2.isSweet);
        System.out.println(bun2.brand);
        System.out.println(bun2.calories);
        System.out.println(bun2.color);
        System.out.println(bun2.expiryDate);
        System.out.println("Ingredients:");
        for (int index=0;index<bun2.ingredients.length;index++) 
		{
            System.out.println(bun2.ingredients[index]);
        }
        System.out.println("Ratings:");
        for (int index=0;index<bun1.ratings.length;index++) 
		{
            System.out.println(bun1.ratings[index]);
        }
    }
}