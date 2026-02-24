class HappyDentRunner
{
	public static void main(String[] args) 
	{
        HappyDent happyDent1 = new HappyDent();

        happyDent1.brand = "HappyDent";
        happyDent1.flavor = "Mint";
        happyDent1.price = 10.0;
        happyDent1.quantity = 1;
        happyDent1.color = "White";
        happyDent1.weight = 5.0;
        happyDent1.isSugarFree = true;
        happyDent1.manufacturer = "Perfetti";
        happyDent1.manufacturingDate = "01-01-2025";
        happyDent1.expiryDate = "01-01-2026";
        happyDent1.shape = "Tablet";
        happyDent1.packagingType = "Blister Pack";
        happyDent1.calories = 5;
        happyDent1.length = 2.0;
        happyDent1.width = 1.0;
        happyDent1.height = 0.5;
        happyDent1.isMintBased = true;
        happyDent1.countryOfOrigin = "India";
        happyDent1.barcode = "HD123456";
        happyDent1.piecesPerPack = 12;
        happyDent1.targetAgeGroup = "Above 5 years";
        happyDent1.texture = "Hard";
        happyDent1.isVegetarian = true;
        happyDent1.storageInstructions = "Store in cool place";
        happyDent1.rating = 4.5;
        happyDent1.reviewsCount = 1500;
        happyDent1.advertisementTagline = "Bright Smile Everyday";
        happyDent1.isAvailableOnline = true;
        happyDent1.distributor = "Local Distributor";
        happyDent1.batchNumber = "B001";
        happyDent1.ingredients = new String[]{"Sorbitol", "Mint Flavor", "Sweetener", "Color"};
        happyDent1.customerRatings = new int[]{5, 4, 5};
		
		System.out.println("----- HappyDent 1 Details -----");
        System.out.println(happyDent1.brand);
        System.out.println(happyDent1.flavor);
        System.out.println(happyDent1.price);
        System.out.println(happyDent1.quantity);
        System.out.println(happyDent1.color);
        System.out.println(happyDent1.weight);
        System.out.println(happyDent1.isSugarFree);
        System.out.println(happyDent1.manufacturer);
        System.out.println(happyDent1.manufacturingDate);
        System.out.println(happyDent1.expiryDate);
        System.out.println(happyDent1.shape);
        System.out.println(happyDent1.packagingType);
        System.out.println(happyDent1.calories);
        System.out.println(happyDent1.length);
        System.out.println(happyDent1.width);
        System.out.println(happyDent1.height);
        System.out.println(happyDent1.isMintBased);
        System.out.println(happyDent1.countryOfOrigin);
        System.out.println(happyDent1.barcode);
        System.out.println(happyDent1.piecesPerPack);
        System.out.println(happyDent1.targetAgeGroup);
        System.out.println(happyDent1.texture);
        System.out.println(happyDent1.isVegetarian);
        System.out.println(happyDent1.storageInstructions);
        System.out.println(happyDent1.rating);
        System.out.println(happyDent1.reviewsCount);
        System.out.println(happyDent1.advertisementTagline);
        System.out.println(happyDent1.isAvailableOnline);
        System.out.println(happyDent1.distributor);
        System.out.println(happyDent1.batchNumber);
        System.out.println("Ingredients:");
        for(int index=0;index<happyDent1.ingredients.length;index++)
		{
            System.out.println(happyDent1.ingredients[index]);
        }
        System.out.println("Customer Ratings:");
        for(int index=0;index<happyDent1.customerRatings.length;index++)
		{
            System.out.println(happyDent1.customerRatings[index]);
        }

		
        HappyDent happyDent2 = new HappyDent();

        happyDent2.brand = "HappyDent";
        happyDent2.flavor = "Strawberry";
        happyDent2.price = 12.0;
        happyDent2.quantity = 1;
        happyDent2.color = "Pink";
        happyDent2.weight = 5.5;
        happyDent2.isSugarFree = false;
        happyDent2.manufacturer = "Perfetti";
        happyDent2.manufacturingDate = "15-02-2025";
        happyDent2.expiryDate = "15-02-2026";
        happyDent2.shape = "Tablet";
        happyDent2.packagingType = "Box";
        happyDent2.calories = 8;
        happyDent2.length = 2.2;
        happyDent2.width = 1.1;
        happyDent2.height = 0.6;
        happyDent2.isMintBased = false;
        happyDent2.countryOfOrigin = "India";
        happyDent2.barcode = "HD654321";
        happyDent2.piecesPerPack = 10;
        happyDent2.targetAgeGroup = "All";
        happyDent2.texture = "Chewy";
        happyDent2.isVegetarian = true;
        happyDent2.storageInstructions = "Keep away from heat";
        happyDent2.rating = 4.2;
        happyDent2.reviewsCount = 800;
        happyDent2.advertisementTagline = "Fresh Breath Always";
        happyDent2.isAvailableOnline = true;
        happyDent2.distributor = "City Distributor";
        happyDent2.batchNumber = "B002";
        happyDent2.ingredients = new String[]{"Sugar", "Strawberry Flavor", "Glucose", "Color"};
        happyDent2.customerRatings = new int[]{4, 4, 3};

        System.out.println("----- HappyDent 2 Details -----");
        System.out.println(happyDent2.brand);
        System.out.println(happyDent2.flavor);
        System.out.println(happyDent2.price);
        System.out.println(happyDent2.quantity);
        System.out.println(happyDent2.color);
        System.out.println(happyDent2.weight);
        System.out.println(happyDent2.isSugarFree);
        System.out.println(happyDent2.manufacturer);
        System.out.println(happyDent2.manufacturingDate);
        System.out.println(happyDent2.expiryDate);
        System.out.println(happyDent2.shape);
        System.out.println(happyDent2.packagingType);
        System.out.println(happyDent2.calories);
        System.out.println(happyDent2.length);
        System.out.println(happyDent2.width);
        System.out.println(happyDent2.height);
        System.out.println(happyDent2.isMintBased);
        System.out.println(happyDent2.countryOfOrigin);
        System.out.println(happyDent2.barcode);
        System.out.println(happyDent2.piecesPerPack);
        System.out.println(happyDent2.targetAgeGroup);
        System.out.println(happyDent2.texture);
        System.out.println(happyDent2.isVegetarian);
        System.out.println(happyDent2.storageInstructions);
        System.out.println(happyDent2.rating);
        System.out.println(happyDent2.reviewsCount);
        System.out.println(happyDent2.advertisementTagline);
        System.out.println(happyDent2.isAvailableOnline);
        System.out.println(happyDent2.distributor);
        System.out.println(happyDent2.batchNumber);
        System.out.println("Ingredients:");
        for(int index=0;index<happyDent2.ingredients.length;index++)
		{
            System.out.println(happyDent2.ingredients[index]);
        }
        System.out.println("Customer Ratings:");
        for(int index=0;index<happyDent2.customerRatings.length;index++)
		{
            System.out.println(happyDent2.customerRatings[index]);
        }
    }

}