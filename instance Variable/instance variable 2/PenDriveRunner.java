class PenDriveRunner
{
	 public static void main(String[] args)
	 {
        PenDrive penDrive1 = new PenDrive();

        penDrive1.brand = "SanDisk";
        penDrive1.model = "Ultra";
        penDrive1.capacityGB = 64;
        penDrive1.price = 699.99;
        penDrive1.color = "Black";
        penDrive1.weight = 10.5;
        penDrive1.usbType = "USB 3.0";
        penDrive1.transferSpeed = 150.5;
        penDrive1.isWaterproof = false;
        penDrive1.isEncrypted = true;
        penDrive1.warrantyYears = 5;
        penDrive1.manufacturingDate = "01-01-2025";
        penDrive1.countryOfOrigin = "India";
        penDrive1.material = "Plastic";
        penDrive1.version = 3;
        penDrive1.hasLedIndicator = true;
        penDrive1.compatibility = "Windows/Mac";
        penDrive1.serialNumber = "SD12345";
        penDrive1.length = 5.5;
        penDrive1.width = 2.0;
        penDrive1.supportedDevices = new String[]{"Laptop", "Desktop", "TV"};
        penDrive1.features = new String[]{"SecureAccess", "FastTransfer", "Compact"};
        penDrive1.ratings = new int[]{4, 5, 5};
		
		System.out.println("----- PenDrive 1 Details -----");
        System.out.println(penDrive1.brand);
        System.out.println(penDrive1.model);
        System.out.println(penDrive1.capacityGB);
        System.out.println(penDrive1.price);
        System.out.println(penDrive1.color);
        System.out.println(penDrive1.weight);
        System.out.println(penDrive1.usbType);
        System.out.println(penDrive1.transferSpeed);
        System.out.println(penDrive1.isWaterproof);
        System.out.println(penDrive1.isEncrypted);
        System.out.println(penDrive1.warrantyYears);
        System.out.println(penDrive1.manufacturingDate);
        System.out.println(penDrive1.countryOfOrigin);
        System.out.println(penDrive1.material);
        System.out.println(penDrive1.version);
        System.out.println(penDrive1.hasLedIndicator);
        System.out.println(penDrive1.compatibility);
        System.out.println(penDrive1.serialNumber);
        System.out.println(penDrive1.length);
        System.out.println(penDrive1.width);
        System.out.println("Supported Devices:");
        for(int index=0;index<penDrive1.supportedDevices.length;index++)
		{
            System.out.println(penDrive1.supportedDevices[index]);
        }
        System.out.println("Features:");
        for(int index=0;index<penDrive1.features.length;index++)
		{
            System.out.println(penDrive1.features[index]);
        }
        System.out.println("Ratings:");
        for(int index=0;index<penDrive1.ratings.length;index++)
		{
            System.out.println(penDrive1.ratings[index]);
        }

		
        PenDrive penDrive2 = new PenDrive();

        penDrive2.brand = "HP";
        penDrive2.model = "v236w";
        penDrive2.capacityGB = 32;
        penDrive2.price = 499.99;
        penDrive2.color = "Silver";
        penDrive2.weight = 9.0;
        penDrive2.usbType = "USB 2.0";
        penDrive2.transferSpeed = 80.0;
        penDrive2.isWaterproof = false;
        penDrive2.isEncrypted = false;
        penDrive2.warrantyYears = 2;
        penDrive2.manufacturingDate = "15-02-2025";
        penDrive2.countryOfOrigin = "China";
        penDrive2.material = "Metal";
        penDrive2.version = 2;
        penDrive2.hasLedIndicator = false;
        penDrive2.compatibility = "Windows";
        penDrive2.serialNumber = "HP67890";
        penDrive2.length = 5.0;
        penDrive2.width = 1.8;
        penDrive2.supportedDevices = new String[]{"Laptop", "Desktop"};
        penDrive2.features = new String[]{"Lightweight", "Durable"};
        penDrive2.ratings = new int[]{3, 4, 4};

        System.out.println("----- PenDrive 2 Details -----");
        System.out.println(penDrive2.brand);
        System.out.println(penDrive2.model);
        System.out.println(penDrive2.capacityGB);
        System.out.println(penDrive2.price);
        System.out.println(penDrive2.color);
        System.out.println(penDrive2.weight);
        System.out.println(penDrive2.usbType);
        System.out.println(penDrive2.transferSpeed);
        System.out.println(penDrive2.isWaterproof);
        System.out.println(penDrive2.isEncrypted);
        System.out.println(penDrive2.warrantyYears);
        System.out.println(penDrive2.manufacturingDate);
        System.out.println(penDrive2.countryOfOrigin);
        System.out.println(penDrive2.material);
        System.out.println(penDrive2.version);
        System.out.println(penDrive2.hasLedIndicator);
        System.out.println(penDrive2.compatibility);
        System.out.println(penDrive2.serialNumber);
        System.out.println(penDrive2.length);
        System.out.println(penDrive2.width);
        System.out.println("Supported Devices:");
        for(int index=0;index<penDrive2.supportedDevices.length;index++)
		{
            System.out.println(penDrive2.supportedDevices[index]);
        }
        System.out.println("Features:");
        for(int index=0;index<penDrive2.features.length;index++)
		{
            System.out.println(penDrive2.features[index]);
        }
        System.out.println("Ratings:");
        for(int index=0;index<penDrive2.ratings.length;index++)
		{
            System.out.println(penDrive2.ratings[index]);
        }
    }
}