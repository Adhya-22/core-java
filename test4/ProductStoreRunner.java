class ProductStoreRunner
{
	public static void main(String... args)
	{
		Product[] products=new Product[10];
		
		Product product1=new Product(101,"GoodDay Biscuit","Brittania","23/04/2025","12/05/2026",
		ProductType.GROCERY,10,40);
		
		ProductStore productStore=new ProductStore(products);
		
		productStore.addProduct(product1);
		
		productStore.displayAll();
		
		System.out.println();
		
		Product productReceived=productStore.getDetailsByProductID(101);
		productReceived.printInfo();
		
		System.out.println();
		
		productStore.getPriceByProductName("GoodDay Biscuit");
		
		productStore.getProductNameByCompany("Brittania");
		
		productStore.getCompanyNameByProductName("GoodDay Biscuit");
		
		productStore.getMfgAndExpByName("GoodDay Biscuit");
		
		productStore.updateMfgAndExpByName("GoodDay Biscuit","31/05/23","23/07/27");
		
		productStore.updatePriceByName("GoodDay Biscuit",20);
		
		productStore.getNameByType(ProductType.GROCERY);
		
		System.out.println(productStore.getMfgDateByName("GoodDay Biscuit"));
		
		System.out.println(productStore.getExpDateByName("GoodDay Biscuit"));
		
		productStore.deleteProductByName("GoodDay Biscuit");
		
		
	}
}