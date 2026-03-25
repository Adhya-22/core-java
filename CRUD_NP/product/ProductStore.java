class ProductStore
{
	Product[] products;
	int currentIndex=0;
	
	ProductStore(Product[] products)
	{
		this.products=products;
	}
	
	void save(Product product)
	{
		System.out.println("Executing save in ProductStore....");
		if(this.products!=null && product!=null)
		{
			int index=this.products.length-1;
			if(this.currentIndex<=index)
			{
				this.products[this.currentIndex]=product;
				System.out.println("Product stored...");
				this.currentIndex++;
			}
			else
			{
				System.out.println("Array is full...");
			}
		}
		else
		{
			System.out.println("References cannot be null...");
		}
	}
	
	void save(Product[] products)
	{
		System.out.println("Executing save multiple in ProductStore...");
		if(products!=null && this.products!=null)
		{
			int index=this.products.length-1;
			if(this.currentIndex<=index)
			{
				int count=0;
				for(Product product:products)
				{
					if(product!=null)
					{
						this.products[this.currentIndex]=product;
						System.out.println("Product no "+count+" stored");
						this.currentIndex++;
					}
					count++;
					if(count>=10)
					{
						System.out.println("Cannot store more than 10 products at a time.");
						break;
					}
						
				}
			}
			else
			{
				System.out.println("Array is full...");
			}
		}
		else
		{
			System.out.println("References cannot be null...");
		}
	}
	
	String search(int id)
	{
		System.out.println("Executing search with UniqueId in ProductStore...");
		if(this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(id==product.uniqueId)
					{
						return "FOUND";
					}
				}
			}
		}
		else
		{
			System.out.println("Array not present..");
		}
		return "NOT FOUND";
	}
	
	String search(int id,String productName)
	{
		System.out.println("Executing search with id and name in ProductStore...");
		if(this.products!=null && productName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(id==product.uniqueId && productName.equals(product.name))
					{
						return "FOUND";
					}
				}
			}
		}
		else
		{
			System.out.println("Array not present..");
		}
		return "NOT FOUND";
	}
	
	String search(int id,String productName,String country)
	{
		System.out.println("Executing search with id,name and originCountry in ProductStore...");
		if(this.products!=null && productName!=null && country!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(id==product.uniqueId && productName.equals(product.name) && country.equals(product.originCountry))
					{
						return "FOUND";
					}
				}
			}
		}
		else
		{
			System.out.println("Array not present..");
		}
		return "NOT FOUND";
	}
	
	void getAllOriginCountry()
	{
		System.out.println("Executing getAllOriginCountry in ProductStore...");
		if(this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					System.out.println(product.originCountry);
				}
			}
		}
		else
		{
			System.out.println("Array not present..");
		}
	}
	
	boolean checkWarrantyExpired(int id)
	{
		System.out.println("Executing checkWarrantyExpired in ProductStore...");
		if(this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null && id==product.uniqueId)
				{
					return product.warrantyExpired;
				}
			}
		}
		else
		{
			System.out.println("Array not present..");
		}
		System.out.println("Product not found..");
		return true;
	}
	
	void displayAllProducts()
	{
		System.out.println("Executing displayAllProducts in ProductStore...");
		if(this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					product.printInfo();
				}
			}
		}
		else
		{
			System.out.println("Array not found..");
		}
	}
	
	void getProductsByType(ProductType type)
	{
		System.out.println("Executing getProductsByType in ProductStore..");
		if(type!=null && this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null && type==product.productType)
				{
					System.out.println(product.name);
				}
			}
		}
		else
		{
			System.out.println("Array or type is null...");
		}
	}
	
	void getProductsByWarrantyYears(WarrantyYears warranty)
	{
		System.out.println("Executing getProductsByType in ProductStore..");
		if(warranty!=null && this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null && warranty==product.warrantyYears)
				{
					System.out.println(product.name);
				}
			}
		}
		else
		{
			System.out.println("Array or warranty is null...");
		}
	}
}