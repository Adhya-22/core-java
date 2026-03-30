class BottleOpenerRunner
{
    public static void main(String[] args)
	{
        BottleOpener bottleOpener1=new BottleOpener();
        bottleOpener1.durability=10;
        bottleOpener1.rustResistant=true;
        bottleOpener1.usageCount=100;
        bottleOpener1.handleType="Rubber";
        bottleOpener1.lightweight=true;
        bottleOpener1.multiPurpose=true;
        bottleOpener1.twist();
        bottleOpener1.hold();
        bottleOpener1.pull();

        BottleOpener bottleOpener2=new BottleOpener();
        bottleOpener2.durability=8;
        bottleOpener2.rustResistant=false;
        bottleOpener2.usageCount=50;
        bottleOpener2.handleType="Plastic";
        bottleOpener2.lightweight=false;
        bottleOpener2.multiPurpose=false;
        bottleOpener2.twist();
        bottleOpener2.hold();
        bottleOpener2.pull();

        Opener opener1=new BottleOpener();
        opener1.durability=7;
        opener1.rustResistant=true;
        opener1.twist();
        opener1.hold();

        Opener opener2=new BottleOpener();
        opener2.durability=9;
        opener2.rustResistant=false;
        opener2.twist();
        opener2.hold();

        Opener opener3=new Opener();
        opener3.durability=5;
        opener3.rustResistant=true;
        opener3.twist();
        opener3.hold();

        Opener opener4=new Opener();
        opener4.durability=4;
        opener4.rustResistant=false;
        opener4.twist();
        opener4.hold();
    }
}