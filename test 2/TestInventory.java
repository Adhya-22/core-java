class TestInventory
{
	public static void main(String[] args)
	{
		InventoryManager inventoryManager1=new InventoryManager(12345,"Parle-G",5,6,10,2,false);
		System.out.println("Stock Status : "+inventoryManager1.checkStockStatus());
		System.out.println("Average Inventory value : "+InventoryManager.getAverageInventoryValue());
		System.out.println("Weekly Revenue value : "+inventoryManager1.calculateWeeklyRevenue());
		
		InventoryManager inventoryManager2=new InventoryManager(23456,"vegetable oil",10,1,100,5,false);
		System.out.println("Stock Status : "+inventoryManager2.checkStockStatus());
		System.out.println("Average Inventory value : "+InventoryManager.getAverageInventoryValue());
		System.out.println("Weekly Revenue value : "+inventoryManager2.calculateWeeklyRevenue());
		
		InventoryManager inventoryManager3=new InventoryManager(34567,"Wheat Flour",6,2,100,1,false);
		System.out.println("Stock Status : "+inventoryManager3.checkStockStatus());
		System.out.println("Average Inventory value : "+InventoryManager.getAverageInventoryValue());
		System.out.println("Weekly Revenue value : "+inventoryManager3.calculateWeeklyRevenue());
		inventoryManager3.restock(10);
		
		InventoryManager inventoryManager4=new InventoryManager(45678,"Detergent",4,1,50,6,false);
		System.out.println("Stock Status : "+inventoryManager4.checkStockStatus());
		System.out.println("Average Inventory value : "+InventoryManager.getAverageInventoryValue());
		System.out.println("Weekly Revenue value : "+inventoryManager4.calculateWeeklyRevenue());
	}
}