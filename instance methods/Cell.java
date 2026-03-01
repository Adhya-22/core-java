class Cell 
{
    String type;
    String shape;
    String size;
    String function;
    String nucleusType;
    String cytoplasm;
    String membraneType;
    String organelles;
    String reproductionType;
    String lifespan;
    String location;
    String structure;
    String energySource;
    String divisionType;
    String dnaType;
    String rnaType;
    String healthCondition;
    String mutationType;
    String species;
    String microscopeType;
	
	Cell(String type,String shape,String size,String function,String nucleusType,String cytoplasm,
	String membraneType,String organelles,String reproductionType,String lifespan,String location,
	String structure,String energySource,String divisionType,String dnaType,String rnaType,
	String healthCondition,String mutationType,String species,String microscopeType)
	{
		this.type=type;
		this.shape=shape;
		this.size=size;
		this.function=function;
		this.nucleusType=nucleusType;
		this.cytoplasm=cytoplasm;
		this.membraneType=membraneType;
		this.organelles=organelles;
		this.reproductionType=reproductionType;
		this.lifespan=lifespan;
		this.location=location;
		this.structure=structure;
		this.energySource=energySource;
		this.divisionType=divisionType;
		this.dnaType=dnaType;
		this.rnaType=rnaType;
		this.healthCondition=healthCondition;
		this.mutationType=mutationType;
		this.species=species;
		this.microscopeType=microscopeType;
	}
	
	void getInfo()
	{
		System.out.println("type : "+this.type);
		System.out.println("shape : "+this.shape);
		System.out.println("size : "+this.type);
		System.out.println("function : "+this.function);
		System.out.println("nucleusType : "+this.nucleusType);
		System.out.println("cytoplasm : "+this.cytoplasm);
		System.out.println("membraneType : "+this.membraneType);
		System.out.println("organelles : "+this.organelles);
		System.out.println("reproductionType : "+this.reproductionType);
		System.out.println("lifespan : "+this.lifespan);
		System.out.println("location : "+this.location);
		System.out.println("structure : "+this.structure);
		System.out.println("energySource : "+this.energySource);
		System.out.println("divisionType : "+this.divisionType);
		System.out.println("dnaType : "+this.dnaType);
		System.out.println("rnaType : "+this.rnaType);
		System.out.println("healthCondition : "+this.healthCondition);
		System.out.println("mutationType : "+this.mutationType);
		System.out.println("species : "+this.species);
		System.out.println("microscopeType : "+this.microscopeType);
	}

}