class ProductStore
{
	Product[] products;
	int currentindex=0;
	
	ProductStore(Product[] products)
	{
		this.products=products;
	}
	
	void addProduct(Product product)
	{
		System.out.println("Executing addProduct in ProductStore");
		if(product!=null && this.products!=null)
		{
			int index=this.products.length-1;
			if(this.currentindex<=index)
			{
				this.products[this.currentindex]=product;
				System.out.println("Product stored at index : "+this.currentindex);
				this.currentindex++;
			}
			else
			{
				System.out.println("Array is full");
			}
		}
		else
		{
			System.out.println("Refernces cannot be null");
		}
	}
	
	void displayAll()
	{
		System.out.println("Executing displayAll in ProductStore");
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
	}
	
	Product getDetailsByProductID(int id)
	{
		System.out.println("Executing getDetailsByProductID in ProductStore");
		if(this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(id==product.productId)
					{
						return product;
					}
				}
			}
		}
		else
		{
			System.out.println("Array not present");
		}
		return null;
	}

	void getPriceByProductName(String name)
	{
		System.out.println("Executing getDetailsByProductName in ProductStore");
		if(this.products!=null && name!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(name.equals(product.productName))
					{
						System.out.println("Price : "+product.price);
					}
				}
			}
		}
		else
		{
			System.out.println("Array not present");
		}	
	}
	
	void getProductNameByCompany(String companyName)
	{
		System.out.println("Executing getProductNameByCompany in ProductStore");
		if(this.products!=null && companyName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(companyName.equals(product.company))
					{
						System.out.println("Product name : "+product.productName);
					}
				}
			}
		}
		else
		{
			System.out.println("References cannot be null");
		}
	}
	
	void getCompanyNameByProductName(String productName)
	{
		System.out.println("Executing getCompanyNameByProductName in ProductStore");
		if(this.products!=null && productName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(productName.equals(product.productName))
					{
						System.out.println("Company Name : "+product.company);
					}
				}
			}
		}
		else
		{
			System.out.println("References cannot be null");
		}
	}
	
	void getMfgAndExpByName(String productName)
	{
		System.out.println("Executing getMfgAndExpByName in ProductStore");
		if(this.products!=null && productName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(productName.equals(product.productName))
					{
						System.out.println("Manufacture Date : "+product.manufactureDate);
						System.out.println("Expiry Date : "+product.expiryDate);
					}
				}
			}
		}
		else
		{
			System.out.println("References cannot be null");
		}
	}
	
	void updateMfgAndExpByName(String productName,String newMfgDate,String newExpDate)
	{
		System.out.println("Executing updateMfgAndExpByName in ProductStore");
		if(this.products!=null && productName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(productName.equals(product.productName))
					{
						if(newMfgDate!=null && newExpDate!=null)
						{
							product.manufactureDate=newMfgDate;
							product.expiryDate=newExpDate;
							System.out.println("Dates Updated");
						}
					}
				}
			}
		}
		else
		{
			System.out.println("References cannot be null");
		}
	}
	
	void updatePriceByName(String productName,double newPrice)
	{
		System.out.println("Executing updatePriceByName in ProductStore");
		if(this.products!=null && productName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(productName.equals(product.productName))
					{
							product.price=newPrice;
							System.out.println("Price Updated");
					}
				}
			}
		}
		else
		{
			System.out.println("References cannot be null");
		}
	}
	
	void getNameByType(ProductType productType)
	{
		System.out.println("Executing getNameByType in ProductStore");
		if(this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(productType.equals(product.productType))
					{
						System.out.println("Product Name : "+product.productName);
					}
				}
			}
		}
		else
		{
			System.out.println("References cannot be null");
		}
	}
	
	void deleteProductByName(String productName)
	{
		System.out.println("Executing deleteProductByName in ProductStore");
		if(this.products!=null && productName!=null)
		{
			int index=0;
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(productName.equals(product.productName))
					{
						this.products[index]=null;
						System.out.println("Product Deleted");
					}
				}
				index++;
			}
		}
		else
		{
			System.out.println("References cannot be null");
		}
	}
	
	String getMfgDateByName(String productName)
	{
		System.out.println("Executing getMfgByName in ProductStore");
		if(this.products!=null && productName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(productName.equals(product.productName))
					{
						String mfg=product.manufactureDate;
						return mfg;
					}
				}
			}
		}
		else
		{
			System.out.println("References cannot be null");
		}
		return null;
	}
	
	String getExpDateByName(String productName)
	{
		System.out.println("Executing getMfgByName in ProductStore");
		if(this.products!=null && productName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(productName.equals(product.productName))
					{
						String exp=product.expiryDate;
						return exp;
					}
				}
			}
		}
		else
		{
			System.out.println("References cannot be null");
		}
		return null;
	}
}