class BridgeRunner
{
    public static void main(String[] args) 
	{
        Bridge bridge1 = new Bridge();
        bridge1.openBridge();
        bridge1.closeBridge();
        bridge1.allowTraffic();
        bridge1.stopTraffic();
        bridge1.inspectBridge();
        bridge1.repairBridge();
        bridge1.cleanBridge();
        bridge1.turnLightsOn();
        bridge1.turnLightsOff();
        bridge1.allowShips();
        bridge1.restrictHeavyVehicles();
        bridge1.measureStrength();
        bridge1.paintBridge();
        bridge1.emergencyAlert();
        bridge1.checkCondition();

        Bridge bridge2 = new Bridge();
        bridge2.openBridge();
        bridge2.closeBridge();
        bridge2.allowTraffic();
        bridge2.stopTraffic();
        bridge2.inspectBridge();
        bridge2.repairBridge();
        bridge2.cleanBridge();
        bridge2.turnLightsOn();
        bridge2.turnLightsOff();
        bridge2.allowShips();
        bridge2.restrictHeavyVehicles();
        bridge2.measureStrength();
        bridge2.paintBridge();
        bridge2.emergencyAlert();
        bridge2.checkCondition();

		
        Bridge.structureType();
        Bridge.materialUsed();
        Bridge.purpose();
        Bridge.maintenanceSchedule();
        Bridge.safetyRules();
    }
}