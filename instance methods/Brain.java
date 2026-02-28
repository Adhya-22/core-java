class Brain 
{
    String partName;
    String function;
    double weight;
    String hemisphere;
    String lobe;
    String color;
    String neuronCount;
    String bloodSupply;
    String structure;
    String developmentStage;
    String disease;
    String protectionLayer;
    String memoryType;
    String responseType;
    String signalType;
    String cognitiveAbility;
    String reflexType;
    String region;
    String healthCondition;
    String neurotransmitter;
	
	Brain(String partName,String function,double weight,String hemisphere,String lobe,String color,
	String neuronCount,String bloodSupply,String structure,String developmentStage,String disease,
	String protectionLayer,String memoryType,String responseType,String signalType,String cognitiveAbility,
	String reflexType,String region,String healthCondition,String neurotransmitter)
	{
		this.partName=partName;
		this.function=function;
		this.weight=weight;
		this.hemisphere=hemisphere;
		this.lobe=lobe;
		this.color=color;
		this.neuronCount=neuronCount;
		this.bloodSupply=bloodSupply;
		this.structure=structure;
		this.developmentStage=developmentStage;
		this.disease=disease;
		this.protectionLayer=protectionLayer;
		this.memoryType=memoryType;
		this.responseType=responseType;
		this.signalType=signalType;
		this.cognitiveAbility=cognitiveAbility;
		this.reflexType=reflexType;
		this.region=region;
		this.healthCondition=healthCondition;
		this.neurotransmitter=neurotransmitter;
	}
	
	void getInfo()
	{
		System.out.println("PartName : "+this.partName);
		System.out.println("function : "+this.function);
		System.out.println("weight : "+this.weight);
		System.out.println("hemisphere : "+this.hemisphere);
		System.out.println("lobe : "+this.lobe);
		System.out.println("color : "+this.color);
		System.out.println("neuronCount : "+this.neuronCount);
		System.out.println("bloodSupply : "+this.bloodSupply);
		System.out.println("structure : "+this.structure);
		System.out.println("developmentStage : "+this.developmentStage);
		System.out.println("disease : "+this.disease);
		System.out.println("protectionLayer : "+this.protectionLayer);
		System.out.println("memoryType : "+this.memoryType);
		System.out.println("responseType : "+this.responseType);
		System.out.println("signalType : "+this.signalType);
		System.out.println("cognitiveAbility : "+this.cognitiveAbility);
		System.out.println("reflexType : "+this.reflexType);
		System.out.println("region : "+this.region);
		System.out.println("healthCondition : "+this.healthCondition);
		System.out.println("neurotransmitter : "+this.neurotransmitter);
	}

}