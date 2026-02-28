class Diabetes 
{
    String type;
    String cause;
    String symptoms;
    String diagnosisMethod;
    String treatment;
    String medication;
    String insulinType;
    String prevention;
    String riskFactors;
    String complications;
    String dietPlan;
    String exercisePlan;
    String monitoringMethod;
    String doctorSpecialist;
    String patientName;
    int age;
    String gender;
    double sugarLevel;
    String stage;
    String awarenessProgram;
	
	Diabetes(String type,String cause,String symptoms,String diagnosisMethod,String treatment,
	String medication,String insulinType,String prevention,String riskFactors,String complications,
	String dietPlan,String exercisePlan,String monitoringMethod,String doctorSpecialist,String patientName,
	int age,String gender,double sugarLevel,String stage,String awarenessProgram)
	{
		this.type=type;
		this.cause=cause;
		this.symptoms=symptoms;
		this.diagnosisMethod=diagnosisMethod;
		this.treatment=treatment;
		this.medication=medication;
		this.insulinType=insulinType;
		this.prevention=prevention;
		this.riskFactors=riskFactors;
		this.complications=complications;
		this.dietPlan=dietPlan;
		this.exercisePlan=exercisePlan;
		this.monitoringMethod=monitoringMethod;
		this.doctorSpecialist=doctorSpecialist;
		this.patientName=patientName;
		this.age=age;
		this.gender=gender;
		this.sugarLevel=sugarLevel;
		this.stage=stage;
		this.awarenessProgram=awarenessProgram;
	}
	
	void getInfo()
	{
		System.out.println("type : "+this.type);
		System.out.println("cause : "+this.cause);
		System.out.println("symptoms : "+this.symptoms);
		System.out.println("diagnosisMethod : "+this.diagnosisMethod);
		System.out.println("treatment : "+this.treatment);
		System.out.println("medication : "+this.medication);
		System.out.println("insulinType : "+this.insulinType);
		System.out.println("prevention : "+this.prevention);
		System.out.println("riskFactors : "+this.riskFactors);
		System.out.println("complications : "+this.complications);
		System.out.println("dietPlan : "+this.dietPlan);
		System.out.println("exercisePlan : "+this.exercisePlan);
		System.out.println("monitoringMethod : "+this.monitoringMethod);
		System.out.println("doctorSpecialist : "+this.doctorSpecialist);
		System.out.println("patientName : "+this.patientName);
		System.out.println("age : "+this.age);
		System.out.println("gender : "+this.gender);
		System.out.println("sugarLevel : "+this.sugarLevel);
		System.out.println("stage : "+this.stage);
		System.out.println("awarenessProgram : "+this.awarenessProgram);
	}

}