 class AirConditionerRunner
 {
	 public static void main(String[] args) 
	 {
        AirConditioner airConditioner1 = new AirConditioner();
		
        airConditioner1.brand = "LG";
        airConditioner1.model = "DualCool";
        airConditioner1.price = 45000.0;
        airConditioner1.type = "Split";
        airConditioner1.weight = 35.5;
        airConditioner1.colors = new String[]{"White", "Silver"};
        airConditioner1.warrantyInYears = 5;
        airConditioner1.working = true;
		
		System.out.println("---- AirConditioner 1 Details ----");
        System.out.println("Brand: " + airConditioner1.brand);
        System.out.println("Model: " + airConditioner1.model);
        System.out.println("Price: " + airConditioner1.price);
        System.out.println("Type: " + airConditioner1.type);
        System.out.println("Weight: " + airConditioner1.weight);
        System.out.println("warrantyInYears: " + airConditioner1.warrantyInYears + " years");
        System.out.println("Working: " + airConditioner1.working);
        System.out.println("Colors:");
        for(int index=0;index<airConditioner1.colors.length;index++)
		{
            System.out.println(airConditioner1.colors[index]);
        }


        AirConditioner airConditioner2 = new AirConditioner();
		
        airConditioner2.brand = "Samsung";
        airConditioner2.model = "WindFree";
        airConditioner2.price = 52000.0;
        airConditioner2.type = "Window";
        airConditioner2.weight = 40.0;
        airConditioner2.colors = new String[]{"White"};
        airConditioner2.warrantyInYears = 3;
        airConditioner2.working = false;
        
        System.out.println("---- AirConditioner 2 Details ----");
        System.out.println("Brand: " + airConditioner2.brand);
        System.out.println("Model: " + airConditioner2.model);
        System.out.println("Price: " + airConditioner2.price);
        System.out.println("Type: " + airConditioner2.type);
        System.out.println("Weight: " + airConditioner2.weight);
        System.out.println("warrantyInYears: " + airConditioner2.warrantyInYears + " years");
        System.out.println("Working: " + airConditioner2.working);
        System.out.println("Colors:");
        for(int index=0;index<airConditioner2.colors.length;index++){
            System.out.println(airConditioner2.colors[index]);
        }
    }
 }