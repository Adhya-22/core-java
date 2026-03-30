class GoodsCarrierRunner
{
    public static void main(String[] args)
	{
        GoodsCarrier goodsCarrier1=new GoodsCarrier();
        goodsCarrier1.type="Truck";
        goodsCarrier1.capacity=1000;
        goodsCarrier1.goodsType="Food";
        goodsCarrier1.weightLimit=5000;
        goodsCarrier1.driverCount=2;
        goodsCarrier1.load();
        goodsCarrier1.unload();
        goodsCarrier1.deliverGoods();

        GoodsCarrier goodsCarrier2=new GoodsCarrier();
        goodsCarrier2.type="Van";
        goodsCarrier2.capacity=500;
        goodsCarrier2.goodsType="Electronics";
        goodsCarrier2.weightLimit=2000;
        goodsCarrier2.driverCount=1;
        goodsCarrier2.load();
        goodsCarrier2.unload();
        goodsCarrier2.deliverGoods();

        Carrier carrier1=new GoodsCarrier();
        carrier1.type="Logistics";
        carrier1.capacity=800;
        carrier1.load();
        carrier1.unload();

        Carrier carrier2=new GoodsCarrier();
        carrier2.type="Delivery";
        carrier2.capacity=600;
        carrier2.load();
        carrier2.unload();

        Carrier carrier3=new Carrier();
        carrier3.type="Cargo";
        carrier3.capacity=700;
        carrier3.load();
        carrier3.unload();

        Carrier carrier4=new Carrier();
        carrier4.type="Supply";
        carrier4.capacity=400;
        carrier4.load();
        carrier4.unload();
    }
}