class Organ 
{
    String name;
    String function;
    String location;
    double weight;
    String size;
    String color;
    String system;
    String disease;
    String bloodSupply;
    String structure;
    String cellType;
    String protection;
    String developmentStage;
    String importance;
    String healthCondition;
    String transplantType;
    String donorType;
    String lifespan;
    String anatomy;
    String physiology;
	
	Organ(String name,String function,String location,double weight,String size,String color,
	String system,String disease,String bloodSupply,String structure,String cellType,String protection,
	String developmentStage,String importance,String healthCondition,String transplantType,
	String donorType,String lifespan,String anatomy,String physiology)
	{
		this.name=name;
		this.function=function;
		this.location=location;
		this.weight=weight;
		this.size=size;
		this.color=color;
		this.system=system;
		this.disease=disease;
		this.bloodSupply=bloodSupply;
		this.structure=structure;
		this.cellType=cellType;
		this.protection=protection;
		this.developmentStage=developmentStage;
		this.importance=importance;
		this.healthCondition=healthCondition;
		this.transplantType=transplantType;
		this.donorType=donorType;
		this.lifespan=lifespan;
		this.anatomy=anatomy;
		this.physiology=physiology;
	}
	
	void getInfo()
	{
		System.out.println("name : "+this.name);
		System.out.println("function : "+this.function);
		System.out.println("location : "+this.location);
		System.out.println("weight : "+this.weight);
		System.out.println("size : "+this.size);
		System.out.println("color : "+this.color);
		System.out.println("system : "+this.system);
		System.out.println("disease : "+this.disease);
		System.out.println("bloodSupply : "+this.bloodSupply);
		System.out.println("structure : "+this.structure);
		System.out.println("cellType : "+this.cellType);
		System.out.println("protection : "+this.protection);
		System.out.println("developmentStage : "+this.developmentStage);
		System.out.println("importance : "+this.importance);
		System.out.println("healthCondition : "+this.healthCondition);
		System.out.println("transplantType : "+this.transplantType);
		System.out.println("donorType : "+this.donorType);
		System.out.println("lifespan : "+this.lifespan);
		System.out.println("anatomy : "+this.anatomy);
		System.out.println("physiology : "+this.physiology);
	}

}