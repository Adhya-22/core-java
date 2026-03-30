class PowerBankRunner
{
    public static void main(String[] args)
	{
        PowerBank powerBank1=new PowerBank();
        powerBank1.brand="Mi";
        powerBank1.portable=true;
        powerBank1.warranty=1;
        powerBank1.capacity=20000;
        powerBank1.fastCharge=true;
        powerBank1.outputPorts=3;
        powerBank1.chargingType="USB-C";
        powerBank1.ledIndicator=true;
        powerBank1.powerOn();
        powerBank1.powerOff();
        powerBank1.supplyPower();

        PowerBank powerBank2=new PowerBank();
        powerBank2.brand="Realme";
        powerBank2.portable=true;
        powerBank2.warranty=2;
        powerBank2.capacity=10000;
        powerBank2.fastCharge=false;
        powerBank2.outputPorts=2;
        powerBank2.chargingType="Micro USB";
        powerBank2.ledIndicator=false;
        powerBank2.powerOn();
        powerBank2.powerOff();
        powerBank2.supplyPower();

        Device device1=new PowerBank();
        device1.brand="Samsung";
        device1.portable=true;
        device1.warranty=1;
        device1.powerOn();
        device1.powerOff();

        Device device2=new PowerBank();
        device2.brand="OnePlus";
        device2.portable=false;
        device2.warranty=2;
        device2.powerOn();
        device2.powerOff();

        Device device3=new Device();
        device3.brand="Generic";
        device3.portable=false;
        device3.warranty=1;
        device3.powerOn();
        device3.powerOff();

        Device device4=new Device();
        device4.brand="BasicDevice";
        device4.portable=true;
        device4.warranty=2;
        device4.powerOn();
        device4.powerOff();
    }
}