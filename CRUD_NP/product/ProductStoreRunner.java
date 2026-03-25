class ProductStoreRunner
{
	public static void main(String[] args)
	{
		Product[] products=new Product[137];
		
		Product product1=new Product("iPhone 15","Apple","2025-01-10",79999.99,ProductType.ELECTRONICS,
		"Flipkart",WarrantyYears.TWO,false,101,"USA");
		ProductStore productStore=new ProductStore(products);
		productStore.save(product1);
		
		Product product2=new Product("Mixer","Philips","2025-02-01",3500,ProductType.ELECTRONICS,"Amazon",
		WarrantyYears.TWO,false,102,"India");

		Product product3=new Product("Fan","Usha","2025-02-02",2200,ProductType.ELECTRONICS,"Flipkart",
		WarrantyYears.THREE,false,103,"India");

		Product product4=new Product("Refrigerator","Samsung","2025-02-03",45000,ProductType.ELECTRONICS,
		"Reliance",WarrantyYears.THREE,false,104,"South Korea");

		Product product5=new Product("Washing Machine","LG","2025-02-04",30000,ProductType.ELECTRONICS,
		"Croma",WarrantyYears.TWO,false,105,"South Korea");

		Product product6=new Product("Jeans","Levis","2025-02-05",2500,ProductType.CLOTHING,"Myntra",
		WarrantyYears.ZERO,true,106,"USA");

		Product product7=new Product("T-Shirt","Puma","2025-02-06",1500,ProductType.CLOTHING,"Amazon",
		WarrantyYears.ZERO,true,107,"Germany");

		Product product8=new Product("Sofa","Durian","2025-02-07",55000,ProductType.FURNITURE,"Durian Store",
		WarrantyYears.THREE,false,108,"India");

		Product product9=new Product("Bed","Ikea","2025-02-08",40000,ProductType.FURNITURE,"Ikea Store",
		WarrantyYears.TWO,false,109,"Sweden");

		Product product10=new Product("Juice","Tropicana","2025-02-12",120,ProductType.FOOD,"Supermarket",
		WarrantyYears.ZERO,true,110,"USA");

		Product product11=new Product("Smart Watch","Noise","2025-02-13",3000,ProductType.ELECTRONICS,
		"Amazon",WarrantyYears.TWO,false,111,"India");
		
		Product product12=new Product("Laptop","Dell","2025-01-01",60000,ProductType.ELECTRONICS,"Amazon",
		WarrantyYears.THREE,false,112,"India");
		
		Product product13=new Product("Mobile","Samsung","2025-01-02",30000,ProductType.ELECTRONICS,"Flipkart",
		WarrantyYears.TWO,false,113,"South Korea");
		
		Product product14=new Product("TV","LG","2025-01-03",45000,ProductType.ELECTRONICS,"Reliance", 
		WarrantyYears.THREE,false,114,"South Korea");
		
		Product product15=new Product("Shoes","Nike","2025-01-04",5000,ProductType.CLOTHING,"Amazon", 
		WarrantyYears.ZERO,true,115,"Vietnam");
		
		Product product16=new Product("Dining Table","Godrej","2025-02-09",25000,ProductType.FURNITURE,
		"Godrej Store",WarrantyYears.THREE,false,116,"India");

		Product product17=new Product("Biscuits","Britannia","2025-02-10",50,ProductType.FOOD,"Supermarket",
		WarrantyYears.ZERO,true,117,"India");

		Product product18=new Product("Chocolates","Cadbury","2025-02-11",100,ProductType.FOOD,"Store",
		WarrantyYears.ZERO,true,118,"UK");
		
		Product product19=new Product("Shirt","Zara","2025-01-05",2500,ProductType.CLOTHING,"Myntra", 
		WarrantyYears.ZERO,true,119,"Spain");
		
		Product product20=new Product("Table","Ikea","2025-01-06",8000,ProductType.FURNITURE,"Ikea Store",
		WarrantyYears.FIVE,false,120,"Sweden");
		
		Product product21=new Product("Air Conditioner","Voltas","2025-02-14",38000,ProductType.ELECTRONICS,
		"Croma",WarrantyYears.THREE,false,121,"India");

		Product product22=new Product("Heater","Bajaj","2025-02-15",2500,ProductType.ELECTRONICS,"Amazon",
		WarrantyYears.TWO,false,122,"India");

		Product product23=new Product("Cap","Adidas","2025-02-19",1200,ProductType.CLOTHING,"Flipkart",
		WarrantyYears.ZERO,true,123,"Germany");

		Product product24=new Product("Cupboard","Godrej","2025-02-20",20000,ProductType.FURNITURE,
		"Godrej Store",WarrantyYears.THREE,false,124,"India");

		Product product25=new Product("Bookshelf","Ikea","2025-02-21",9000,ProductType.FURNITURE,"Ikea Store",
		WarrantyYears.TWO,false,125,"Sweden");

		Product product26=new Product("Office Chair","Featherlite","2025-02-22",7000,ProductType.FURNITURE,
		"Local Store",WarrantyYears.THREE,false,126,"India");

		Product product27=new Product("Noodles","Maggi","2025-02-23",40,ProductType.FOOD,"Supermarket",
		WarrantyYears.ZERO,true,127,"India");

		Product product28 = new Product("Coffee", "Nescafe", "2025-02-24", 350,
        ProductType.FOOD, "Store", WarrantyYears.ZERO, true, 128, "Switzerland");

		Product product29 = new Product("Blender", "Prestige", "2025-02-16", 1800,
        ProductType.ELECTRONICS, "Flipkart", WarrantyYears.TWO, false, 129, "India");

		Product product30 = new Product("Kurta", "FabIndia", "2025-02-17", 2200,
        ProductType.CLOTHING, "Myntra", WarrantyYears.ZERO, true, 130, "India");

		Product product31 = new Product("Jacket", "North Face", "2025-02-18", 6500,
        ProductType.CLOTHING, "Amazon", WarrantyYears.ZERO, true, 131, "USA");
		
		Product product32 = new Product("Milk", "Amul", "2025-02-25", 60,
        ProductType.FOOD, "Dairy", WarrantyYears.ZERO, true, 132, "India");

		Product product33 = new Product("Speaker", "JBL", "2025-02-26", 5000,
        ProductType.ELECTRONICS, "Amazon", WarrantyYears.TWO, false, 133, "USA");

		Product product34 = new Product("Printer", "HP", "2025-02-28", 12000,
        ProductType.ELECTRONICS, "Flipkart", WarrantyYears.TWO, false, 134, "USA");
		
		Product product35 = new Product("Chair", "Nilkamal", "2025-01-07", 1500,ProductType.FURNITURE,
		"Local Store", WarrantyYears.FIVE, false, 135, "India");
		
		Product product36 = new Product("Rice", "India Gate", "2025-01-08", 1200,ProductType.FOOD, "Supermarket",
		WarrantyYears.ZERO, true, 136, "India");

		Product product37 = new Product("Jacket", "Puma", "2025-01-12", 3500,ProductType.CLOTHING, "Myntra", 
		WarrantyYears.ZERO, true, 137, "Germany");
		
		Product product38 = new Product("Router", "TP-Link", "2025-03-01", 2500,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.TWO, false, 138, "China");

		Product product39 = new Product("Keyboard", "Logitech", "2025-03-02", 1500,ProductType.ELECTRONICS, 
		"Flipkart", WarrantyYears.TWO, false, 139, "USA");

		Product product40 = new Product("Mouse", "HP", "2025-03-03", 800,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.TWO, false, 140, "USA");

		Product product41 = new Product("Monitor", "Dell", "2025-03-04", 12000, ProductType.ELECTRONICS, 
		"Croma", WarrantyYears.THREE, false, 141, "India");

		Product product42 = new Product("Power Bank", "Mi", "2025-03-05", 2000,ProductType.ELECTRONICS, 
		"Flipkart", WarrantyYears.TWO, false, 142, "China");

		Product product43 = new Product("Sweater", "H&M", "2025-03-06", 3000,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 143, "Sweden");
		
		Product product44 = new Product("Microwave", "IFB", "2025-03-21", 12000, ProductType.ELECTRONICS, 
		"Croma", WarrantyYears.THREE, false, 144, "India");

		Product product45 = new Product("Iron Box", "Philips", "2025-03-22", 2000,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.TWO, false, 145, "India");

		Product product46 = new Product("Vacuum Cleaner", "Eureka Forbes", "2025-03-23", 8000, ProductType.ELECTRONICS, 
		"Flipkart", WarrantyYears.THREE, false, 146, "India");

		Product product47 = new Product("Hair Dryer", "Panasonic", "2025-03-24", 1500, ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.TWO, false, 147, "Japan");

		Product product48 = new Product("Hoodie", "Zara", "2025-03-25", 3500,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 148, "Spain");

		Product product49 = new Product("Blazer", "Raymond", "2025-03-26", 7000,ProductType.CLOTHING, 
		"Store", WarrantyYears.ZERO, true, 149, "India");

		Product product50 = new Product("Camera", "Canon", "2025-02-27", 55000,ProductType.ELECTRONICS, 
		"Croma", WarrantyYears.THREE, false, 150, "Japan");

		Product product51 = new Product("Skirt", "H&M", "2025-03-27", 2500,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 151, "Sweden");

		Product product52 = new Product("Dining Chair", "Nilkamal", "2025-03-28", 1800,ProductType.FURNITURE, 
		"Local Store", WarrantyYears.TWO, false, 152, "India");

		Product product53 = new Product("TV Stand", "Ikea", "2025-03-29", 10000,ProductType.FURNITURE, 
		"Ikea Store", WarrantyYears.THREE, false, 153, "Sweden");

		Product product54 = new Product("Cup Set", "Cello", "2025-03-30", 600,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 154, "India");

		Product product55 = new Product("Dinner Set", "Borosil", "2025-03-31", 3000,ProductType.FOOD, 
		"Store", WarrantyYears.ZERO, true, 155, "India");

		Product product56 = new Product("Water Bottle", "Milton", "2025-04-01", 500,ProductType.FOOD, 
		"Store", WarrantyYears.ZERO, true, 156, "India");
	
		Product product57 = new Product("Gaming Console", "Sony", "2025-04-02", 50000,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.THREE, false, 157, "Japan");

		Product product58 = new Product("Earbuds", "Boat", "2025-04-03", 3000,ProductType.ELECTRONICS, 
		"Flipkart", WarrantyYears.TWO, false, 158, "India");

		Product product59 = new Product("Laptop Bag", "Wildcraft", "2025-04-04", 2000,ProductType.CLOTHING, 
		"Amazon", WarrantyYears.ZERO, true, 159, "India");

		Product product60 = new Product("Track Pants", "Adidas", "2025-04-05", 2800,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 160, "Germany");

		Product product61 = new Product("Bookshelf Rack", "Godrej", "2025-04-06", 12000,ProductType.FURNITURE, 
		"Godrej Store", WarrantyYears.THREE, false, 161, "India");

		Product product62 = new Product("Office Desk", "Ikea", "2025-04-07", 18000,ProductType.FURNITURE, 
		"Ikea Store", WarrantyYears.TWO, false, 162, "Sweden");

		Product product63 = new Product("Snacks", "Haldiram", "2025-04-08", 150,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 163, "India");

		Product product64 = new Product("Soft Drink", "CocaCola", "2025-04-09", 80,ProductType.FOOD, 
		"Store", WarrantyYears.ZERO, true, 164, "USA");

		Product product65 = new Product("Shorts", "Nike", "2025-03-07", 1800,ProductType.CLOTHING, 
		"Amazon", WarrantyYears.ZERO, true, 165, "Vietnam");

		Product product66 = new Product("Saree", "Manyavar", "2025-03-08", 5000,ProductType.CLOTHING, 
		"Store", WarrantyYears.ZERO, true, 166, "India");

		Product product67 = new Product("Wardrobe", "Godrej", "2025-03-09", 30000,ProductType.FURNITURE, 
		"Godrej Store", WarrantyYears.THREE, false, 167, "India");

		Product product68 = new Product("Study Table", "Ikea", "2025-03-10", 15000,ProductType.FURNITURE, 
		"Ikea Store", WarrantyYears.TWO, false, 168, "Sweden");

		Product product69 = new Product("Books", "Classmate", "2025-03-11", 500,ProductType.FOOD, 
		"Stationery Shop", WarrantyYears.ZERO, true, 169, "India");

		Product product70 = new Product("Bread", "Britannia", "2025-03-12", 40,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 170, "India");

		Product product71 = new Product("Butter", "Amul", "2025-03-13", 60,ProductType.FOOD, 
		"Dairy", WarrantyYears.ZERO, true, 171, "India");

		Product product72 = new Product("Headset", "Boat", "2025-03-14", 2500,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.TWO, false, 172, "India");

		Product product73 = new Product("Tablet", "Samsung", "2025-03-15", 25000,ProductType.ELECTRONICS, 
		"Flipkart", WarrantyYears.THREE, false, 173, "South Korea");

		Product product74 = new Product("Charger", "OnePlus", "2025-03-16", 1800,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.TWO, false, 174, "China");

		Product product75 = new Product("Jeans", "Wrangler", "2025-03-17", 2800,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 175, "USA");

		Product product76 = new Product("Smart TV", "Sony", "2025-04-10", 65000,ProductType.ELECTRONICS, 
		"Croma", WarrantyYears.THREE, false, 176, "Japan");

		Product product77 = new Product("Induction Stove", "Prestige", "2025-04-11", 3000,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.TWO, false, 177, "India");

		Product product78 = new Product("Toaster", "Bajaj", "2025-04-12", 1500,ProductType.ELECTRONICS, 
		"Flipkart", WarrantyYears.TWO, false, 178, "India");

		Product product79 = new Product("Grinder", "Butterfly", "2025-04-13", 4000,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.THREE, false, 179, "India");

		Product product80 = new Product("Coat", "Allen Solly", "2025-04-14", 6000,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 180, "India");

		Product product81 = new Product("Dress", "Zara", "2025-04-15", 4500,ProductType.CLOTHING, 
		"Store", WarrantyYears.ZERO, true, 181, "Spain");

		Product product82 = new Product("Scarf", "H&M", "2025-04-16", 1200,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 182, "Sweden");

		Product product83 = new Product("Dining Bench", "Ikea", "2025-04-17", 9000,ProductType.FURNITURE, 
		"Ikea Store", WarrantyYears.TWO, false, 183, "Sweden");

		Product product84 = new Product("Shoe Rack", "Nilkamal", "2025-04-18", 2500,ProductType.FURNITURE, 
		"Local Store", WarrantyYears.THREE, false, 184, "India");

		Product product85 = new Product("Center Table", "Durian", "2025-04-19", 15000,ProductType.FURNITURE, 
		"Durian Store", WarrantyYears.THREE, false, 185, "India");

		Product product86= new Product("Pickle", "Priya", "2025-04-20", 200,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 186, "India");

		Product product87 = new Product("Honey", "Dabur", "2025-04-21", 300,ProductType.FOOD, 
		"Store", WarrantyYears.ZERO, true, 187, "India");

		Product product88 = new Product("Ice Cream", "Amul", "2025-04-22", 150,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 188, "India");

		Product product89 = new Product("Drone", "DJI", "2025-04-23", 80000,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.THREE, false, 189, "China");

		Product product90 = new Product("VR Headset", "Meta", "2025-04-24", 50000,ProductType.ELECTRONICS, 
		"Flipkart", WarrantyYears.TWO, false, 190, "USA");

		Product product91 = new Product("Gym Wear", "Nike", "2025-04-25", 3500,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 191, "Vietnam");

		Product product92 = new Product("Formal Shirt", "Van Heusen", "2025-04-26", 2800,ProductType.CLOTHING, 
		"Store", WarrantyYears.ZERO, true, 192, "India");

		Product product93 = new Product("Water Purifier", "Kent", "2025-04-30", 15000,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.THREE, false, 193, "India");

		Product product94 = new Product("Ceiling Fan", "Havells", "2025-05-01", 3500,ProductType.ELECTRONICS, 
		"Flipkart", WarrantyYears.TWO, false, 194, "India");

		Product product95 = new Product("Electric Kettle", "Prestige", "2025-05-02", 1800,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.TWO, false, 195, "India");

		Product product96= new Product("Rice Cooker", "Panasonic", "2025-05-03", 3000,ProductType.ELECTRONICS, 
		"Croma", WarrantyYears.THREE, false, 196, "Japan");

		Product product97 = new Product("Sweatshirt", "Puma", "2025-05-04", 2500,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 197, "Germany");

		Product product98 = new Product("Blouse", "Biba", "2025-05-05", 1500,ProductType.CLOTHING, 
		"Store", WarrantyYears.ZERO, true, 198, "India");

		Product product99 = new Product("Tie", "Raymond", "2025-05-06", 1200,ProductType.CLOTHING, 
		"Store", WarrantyYears.ZERO, true, 199, "India");

		Product product100 = new Product("Recliner", "Durian", "2025-05-07", 40000,ProductType.FURNITURE, 
		"Durian Store", WarrantyYears.THREE, false, 200, "India");

		Product product101 = new Product("Coffee Table", "Ikea", "2025-05-08", 12000,ProductType.FURNITURE, 
		"Ikea Store", WarrantyYears.TWO, false, 201, "Sweden");

		Product product102 = new Product("Storage Cabinet", "Godrej", "2025-05-09", 18000,ProductType.FURNITURE, 
		"Godrej Store", WarrantyYears.THREE, false, 202, "India");

		Product product103 = new Product("Sauce", "Kissan", "2025-05-10", 120,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 203, "India");

		Product product104 = new Product("Jam", "Kissan", "2025-05-11", 180,ProductType.FOOD, 
		"Store", WarrantyYears.ZERO, true, 204, "India");

		Product product105 = new Product("Cheese", "Amul", "2025-05-12", 250,ProductType.FOOD, 
		"Dairy", WarrantyYears.ZERO, true, 205, "India");

		Product product106 = new Product("Gaming Laptop", "Asus", "2025-05-13", 90000,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.THREE, false, 206, "Taiwan");

		Product product107=new Product("Fitness Band", "Mi", "2025-05-14", 2500,ProductType.ELECTRONICS, 
		"Flipkart", WarrantyYears.TWO, false, 207, "China");

		Product product108=new Product("Sports Shoes", "Reebok", "2025-05-15", 4000,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 208, "USA");

		Product product109=new Product("Kurti", "Biba", "2025-05-16", 2200,ProductType.CLOTHING, 
		"Store", WarrantyYears.ZERO, true, 209, "India");

		Product product110=new Product("TV Unit", "Ikea", "2025-05-17", 20000,ProductType.FURNITURE, 
		"Ikea Store", WarrantyYears.TWO, false, 210, "Sweden");

		Product product111=new Product("Side Table", "Nilkamal", "2025-05-18", 3000,ProductType.FURNITURE, 
		"Local Store", WarrantyYears.THREE, false, 211, "India");

		Product product112=new Product("Bookshelf Cabinet", "Godrej", "2025-05-19", 22000,ProductType.FURNITURE, 
		"Godrej Store", WarrantyYears.THREE, false, 212, "India");

		Product product113=new Product("Biscuits Pack", "Parle", "2025-05-20", 30,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 213, "India");

		Product product114=new Product("Energy Drink", "RedBull", "2025-05-21", 120,ProductType.FOOD, 
		"Store", WarrantyYears.ZERO, true, 214, "Austria");

		Product product115=new Product("Juice Pack", "Real", "2025-05-22", 90,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 215, "India");

		Product product116=new Product("DSLR Camera", "Nikon", "2025-05-23", 65000,ProductType.ELECTRONICS, 
		"Croma", WarrantyYears.THREE, false, 216, "Japan");

		Product product117=new Product("Bluetooth Speaker", "Sony", "2025-05-24", 6000,ProductType.ELECTRONICS, 
		"Amazon", WarrantyYears.TWO, false, 217, "Japan");

		Product product118=new Product("Formal Pants", "Peter England", "2025-05-25", 2500,ProductType.CLOTHING, 
		"Store", WarrantyYears.ZERO, true, 218, "India");

		Product product119=new Product("Casual Shirt", "Levis", "2025-05-26", 2800,ProductType.CLOTHING, 
		"Myntra", WarrantyYears.ZERO, true, 219, "USA");

		Product product120=new Product("Office Sofa", "Durian", "2025-05-27", 45000,ProductType.FURNITURE, 
		"Durian Store", WarrantyYears.THREE, false, 220, "India");

		Product product121=new Product("Wooden Desk", "Ikea", "2025-05-28", 25000,ProductType.FURNITURE, 
		"Ikea Store", WarrantyYears.TWO, false, 221, "Sweden");
		
		Product product122=new Product("Drawer Unit", "Godrej", "2025-04-27", 12000,ProductType.FURNITURE, 
		"Godrej Store", WarrantyYears.THREE, false, 222, "India");

		Product product123=new Product("Wall Shelf", "Ikea", "2025-04-28", 5000,ProductType.FURNITURE, 
		"Ikea Store", WarrantyYears.TWO, false, 223, "Sweden");

		Product product124=new Product("Chips", "Lays", "2025-04-29", 50,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 224, "USA");
		
		Product product125=new Product("Trousers", "Peter England", "2025-03-18", 2200,ProductType.CLOTHING, 
		"Store", WarrantyYears.ZERO, true, 225, "India");

		Product product126=new Product("Bedside Table", "Durian", "2025-03-19", 6000,ProductType.FURNITURE, 
		"Durian Store", WarrantyYears.THREE, false, 226, "India");

		Product product127=new Product("Curtains", "Home Centre", "2025-03-20", 2000,ProductType.FURNITURE, 
		"Store", WarrantyYears.TWO, false, 227, "UAE");
		
		Product product128=new Product("Storage Rack", "Nilkamal", "2025-05-29", 5000, ProductType.FURNITURE, 
		"Local Store", WarrantyYears.THREE, false, 228, "India");

		Product product129=new Product("Namkeen", "Haldiram", "2025-05-30", 100,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 229, "India");

		Product product130=new Product("Cold Coffee", "Nescafe", "2025-05-31", 150,ProductType.FOOD, 
		"Store", WarrantyYears.ZERO, true, 230, "Switzerland");

		Product product131=new Product("Frozen Pizza", "McCain", "2025-06-01", 300,ProductType.FOOD, 
		"Supermarket", WarrantyYears.ZERO, true, 231, "Canada");

		Product product132=new Product("Smart Glasses", "RayBan", "2025-06-02", 20000,ProductType.ELECTRONICS,
		"Store", WarrantyYears.TWO, false, 232, "Italy");

		Product product133=new Product("Wireless Charger","Anker","2025-06-03",2500,ProductType.ELECTRONICS,
		"Amazon",WarrantyYears.TWO,false,233,"China");

		Product product134=new Product("Track Jacket","Adidas","2025-06-04",4000,ProductType.CLOTHING,
		"Myntra",WarrantyYears.ZERO,true,234,"Germany");

		Product product135=new Product("Bean Bag","AmazonBasics","2025-06-05",3500,ProductType.FURNITURE,
		"Amazon",WarrantyYears.TWO,false,235,"USA");

		Product product136=new Product("Watch","Fastrack","2025-01-10",4000,ProductType.ELECTRONICS,"Titan Store",
		WarrantyYears.FIVE,false,236,"India");

		Product product137=new Product("Headphones","Sony","2025-01-11",7000,ProductType.ELECTRONICS,"Amazon",
		WarrantyYears.TWO,false,237,"Japan");
		
		Product[] items1={product2,product3,product4,product5,product6,product7,product8,product9,product10,product11};
		productStore.save(items1);
		
		Product[] items2={product12,product13,product14,product15,product16,product17,product18,product19,product20,product21};
		productStore.save(items2);
		
		Product[] items3={product22,product23,product24,product25,product26,product27,product28,product29,product30,product31};
		productStore.save(items3);
		
		Product[] items4={product32,product33,product34,product35,product36,product37,product38,product39,product40,product41};
		productStore.save(items4);
		
		Product[] items5={product42,product43,product44,product45,product46,product47,product48,product49,product50,product51};
		productStore.save(items5);
		
		Product[] items6={product52,product53,product54,product55,product56,product57,product58,product59,product60,product61};
		productStore.save(items6);
		
		Product[] items7={product62,product63,product64,product65,product66,product67,product68,product69,product70,product71};
		productStore.save(items7);
		
		Product[] items8={product72,product73,product74,product75,product76,product77,product78,product79,product80,product81};
		productStore.save(items8);
		
		Product[] items9={product82,product83,product84,product85,product86,product87,product88,product89,product90,product91};
		productStore.save(items9);
		
		Product[] items10={product92,product93,product94,product95,product96,product97,product98,product99,product100,product101};
		productStore.save(items10);
		
		Product[] items11={product102,product103,product104,product105,product106,product107,product108,product109,product110,product111};
		productStore.save(items11);
		
		Product[] items12={product112,product113,product114,product115,product116,product117,product118,product119,product120,product121};
		productStore.save(items12);
		
		Product[] items13={product122,product123,product124,product125,product126,product127,product128,product129,product130,product131};
		productStore.save(items13);
		
		Product[] items14={product132,product133,product134,product135,product136,product137};
		productStore.save(items14);
		
		System.out.println(productStore.search(105));
		
		System.out.println(productStore.search(106,"Shirt"));
		
		productStore.getAllOriginCountry();
		
		System.out.println(productStore.checkWarrantyExpired(113));
		
		productStore.displayAllProducts();
		
		productStore.getProductsByType(ProductType.CLOTHING);
		
		productStore.getProductsByWarrantyYears(WarrantyYears.FIVE);
	}
}