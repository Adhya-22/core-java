class InventoryManager
{
	static int totalProductsTracked;
	static double totalInventoryValue;
	
	int productId;
	String productName;
	int currentStock;
	double dailySalesRate;
	double unitPrice;
	double leadTimeDays;
	boolean isSeasonal;
	
	InventoryManager(int productId,String productName,int currentStock,double dailySalesRate,
	double unitPrice,int leadTimeDays,boolean isSeasonal)
	{
		this.productId=productId;
		this.productName=productName;
		this.currentStock=currentStock;
		this.dailySalesRate=dailySalesRate;
		this.unitPrice=unitPrice;
		this.leadTimeDays=leadTimeDays;
		this.isSeasonal=isSeasonal;
		
		totalProductsTracked++;
		totalInventoryValue+=(currentStock*unitPrice);
	}
	
	static double getAverageInventoryValue()
	{
		return totalInventoryValue/totalProductsTracked;
	}
	
	int calculateReorderPoint()
	{
        int base=(int)(dailySalesRate*leadTimeDays*1.5);

        if(isSeasonal)
		{
            base=(int)(base*1.3);
        }

        if(currentStock<20)
		{
            base+=10;
        }

        return base;
    }
	
	String checkStockStatus()
	{
		if(currentStock<=0)
			return "OUT OF STOCK--URGENT";
		else if(currentStock<=calculateReorderPoint())
			return "REORDER NEEDED-Order"+(calculateReorderPoint()*2-currentStock)+"units";
		else if(currentStock<=calculateReorderPoint()*1.5)
			return "LOW STOCK-Monitor Closely";
		else
			return "HEALTHY STOCK";
	}
	
	double calculateWeeklyRevenue()
	{
        int workingDays=7;
        int day=1;
        int availableStock=currentStock;
        double unitsSold=0;

        while(day<=workingDays && availableStock>0)
		{
            if(availableStock>=dailySalesRate)
			{
                unitsSold+=dailySalesRate;
                availableStock-=dailySalesRate;
            } 
			else 
			{
                unitsSold+=availableStock;
                availableStock=0;
            }
            day++;
        }

        return unitsSold * unitPrice;
    }
	
	void restock(int unitsReceived)
	{
		currentStock+=unitsReceived;
		totalInventoryValue+=(unitsReceived*unitPrice);
		
		System.out.println("Restocked : "+unitsReceived+" units of "+productName);
	}
}