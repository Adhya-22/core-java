class ResourceRunner
{
    public static void main(String[] args)
	{
        Resource r1 = new Resource();
        r1.allocate();
        r1.deallocate();
        r1.consume();
        r1.replenish();
        r1.monitorUsage();
        r1.calculateAvailability();
        r1.optimizeUsage();
        r1.reserve();
        r1.release();
        r1.trackEfficiency();
        r1.checkLimit();
        r1.upgrade();
        r1.downgrade();
        r1.audit();
        r1.reportStatus();

        Resource r2 = new Resource();
        r2.allocate();
        r2.deallocate();
        r2.consume();
        r2.replenish();
        r2.monitorUsage();
        r2.calculateAvailability();
        r2.optimizeUsage();
        r2.reserve();
        r2.release();
        r2.trackEfficiency();
        r2.checkLimit();
        r2.upgrade();
        r2.downgrade();
        r2.audit();
        r2.reportStatus();

       
        Resource.resourceType();
        Resource.importance();
        Resource.conservation();
        Resource.renewableType();
        Resource.managementStrategy();
    }
}