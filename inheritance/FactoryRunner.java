class FactoryRunner
{
    public static void main(String[] args)
	{
        MobileFactory mobileFactory1=new MobileFactory();
        mobileFactory1.location="Bangalore";
        mobileFactory1.workers=200;
        mobileFactory1.operational=true;
        mobileFactory1.brand="Samsung";
        mobileFactory1.mobilesPerDay=500;
        mobileFactory1.qualityCheck=true;
        mobileFactory1.processorType="Snapdragon";
        mobileFactory1.produce();
        mobileFactory1.distribute();
        mobileFactory1.assemble();

        MobileFactory mobileFactory2=new MobileFactory();
        mobileFactory2.location="Chennai";
        mobileFactory2.workers=150;
        mobileFactory2.operational=false;
        mobileFactory2.brand="OnePlus";
        mobileFactory2.mobilesPerDay=300;
        mobileFactory2.qualityCheck=true;
        mobileFactory2.processorType="MediaTek";
        mobileFactory2.produce();
        mobileFactory2.distribute();
        mobileFactory2.assemble();

        Factory factory1=new MobileFactory();
        factory1.location="Hyderabad";
        factory1.workers=120;
        factory1.operational=true;
        factory1.produce();
        factory1.distribute();

        Factory factory2=new MobileFactory();
        factory2.location="Delhi";
        factory2.workers=90;
        factory2.operational=false;
        factory2.produce();
        factory2.distribute();

        Factory factory3=new Factory();
        factory3.location="Mumbai";
        factory3.workers=70;
        factory3.operational=true;
        factory3.produce();
        factory3.distribute();
		
        Factory factory4=new Factory();
        factory4.location="Pune";
        factory4.workers=60;
        factory4.operational=false;
        factory4.produce();
        factory4.distribute();
    }
}