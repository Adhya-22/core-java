class GoodsCarrier extends Carrier
{
    String goodsType;
    int weightLimit;
    int driverCount;

    GoodsCarrier() 
	{
        System.out.println("Non-parameterized constructor of GoodsCarrier");
    }

    void deliverGoods()
	{
        System.out.println("Executing deliverGoods in GoodsCarrier");
    }
}