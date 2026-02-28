class Toxic
{
    String substanceName;
    String chemicalFormula;
    String state;
    String color;
    String odor;
    double density;
    double boilingPoint;
    double meltingPoint;
    String hazardLevel;
    String storageCondition;
    String usage;
    boolean flammable;
    boolean corrosive;
    boolean radioactive;
    String manufacturer;
    String country;
    String safetyMeasures;
    String exposureLimit;
    String antidote;
    String disposalMethod;
	
	Toxic(String substanceName,String chemicalFormula,String state,String color,String odor,double density,
	double boilingPoint,double meltingPoint,String hazardLevel,String storageCondition,String usage,
	boolean flammable,boolean corrosive,boolean radioactive,String manufacturer,String country,
	String safetyMeasures,String exposureLimit,String antidote,String disposalMethod)
	{
		this.substanceName=substanceName;
		this.chemicalFormula=chemicalFormula;
		this.state=state;
		this.color=color;
		this.odor=odor;
		this.density=density;
		this.boilingPoint=boilingPoint;
		this.meltingPoint=meltingPoint;
		this.hazardLevel=hazardLevel;
		this.storageCondition=storageCondition;
		this.usage=usage;
		this.flammable=flammable;
		this.corrosive=corrosive;
		this.radioactive=radioactive;
		this.manufacturer=manufacturer;
		this.country=country;
		this.safetyMeasures=safetyMeasures;
		this.exposureLimit=exposureLimit;
		this.antidote=antidote;
		this.disposalMethod=disposalMethod;
	}
	
	void getInfo()
	{
		System.out.println("substanceName : "+this.substanceName);
		System.out.println("chemicalFormula : "+this.chemicalFormula);
		System.out.println("state : "+this.state);
		System.out.println("color : "+this.color);
		System.out.println("odor : "+this.odor);
		System.out.println("density : "+this.density);
		System.out.println("boilingPoint : "+this.boilingPoint);
		System.out.println("meltingPoint : "+this.meltingPoint);
		System.out.println("hazardLevel : "+this.hazardLevel);
		System.out.println("storageCondition : "+this.storageCondition);
		System.out.println("usage : "+this.usage);
		System.out.println("flammable : "+this.flammable);
		System.out.println("corrosive : "+this.corrosive);
		System.out.println("radioactive : "+this.radioactive);
		System.out.println("manufacturer : "+this.manufacturer);
		System.out.println("country : "+this.country);
		System.out.println("safetyMeasures : "+this.safetyMeasures);
		System.out.println("exposureLimit : "+this.exposureLimit);
		System.out.println("antidote : "+this.antidote);
		System.out.println("disposalMethod : "+this.disposalMethod);
	}

}