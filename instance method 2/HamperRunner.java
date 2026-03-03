class HamperRunner
{
    public static void main(String[] args) 
	{
        Hamper h1 = new Hamper();
        h1.storeClothes();
        h1.removeClothes();
        h1.openLid();
        h1.closeLid();
        h1.cleanHamper();
        h1.washClothes();
        h1.dryClothes();
        h1.moveHamper();
        h1.checkCapacity();
        h1.increaseCapacity();
        h1.decreaseCapacity();
        h1.fillHamper();
        h1.emptyHamper();
        h1.repairHamper();
        h1.replaceHamper();

		Hamper h2 = new Hamper();
        h2.storeClothes();
        h2.removeClothes();
        h2.openLid();
        h2.closeLid();
        h2.cleanHamper();
        h2.washClothes();
        h2.dryClothes();
        h2.moveHamper();
        h2.checkCapacity();
        h2.increaseCapacity();
        h2.decreaseCapacity();
        h2.fillHamper();
        h2.emptyHamper();
        h2.repairHamper();
        h2.replaceHamper();

		
		
        Hamper.materialType();
        Hamper.purpose();
        Hamper.shape();
        Hamper.usageArea();
        Hamper.recyclable();
    }
}