class DiabetesRunner
{
	public static void main(String[] args)
	{
		Diabetes diabetes1 = new Diabetes("Type 1","Autoimmune","Frequent urination","Blood Test",
        "Insulin Therapy","Insulin","Rapid Acting","Healthy Diet","Genetics","Kidney Issues",
        "Low Sugar Diet","Daily Walk","Glucometer","Endocrinologist","Rahul",18,"Male",180.5,
		"Early","WHO Program");
		diabetes1.getInfo();

		Diabetes diabetes2 = new Diabetes("Type 2","Lifestyle","Fatigue","HbA1c Test","Medication",
		"Metformin","Long Acting","Exercise","Obesity","Heart Disease","Balanced Diet","Gym",
		"Blood Monitor","Diabetologist","Anita",45,"Female",220.0,"Advanced","Govt Campaign");
		diabetes2.getInfo();

		Diabetes diabetes3 = new Diabetes("Gestational","Pregnancy","High Sugar","Blood Test",
        "Diet Control","Insulin","Short Acting","Healthy Lifestyle","Pregnancy","Delivery Risk",
        "Low Carb Diet","Light Yoga","Glucometer","Gynecologist","Priya",30,"Female",160.0,
		"Moderate","Hospital Program");
		diabetes3.getInfo();

		Diabetes diabetes4 = new Diabetes("Type 2","Genetics","Blurred Vision","Blood Test","Medication",
		"Glipizide","Long Acting","Diet","Family History","Neuropathy","Low Sugar Diet","Walking",
		"Blood Monitor","Endocrinologist","Ramesh",50,"Male",210.0,"Advanced","WHO Program");
		diabetes4.getInfo();

		Diabetes diabetes5 = new Diabetes("Type 1","Immune Disorder","Weight Loss","HbA1c","Insulin",
		"Insulin","Rapid Acting","Monitoring","Genetics","Kidney Damage","Strict Diet","Daily Exercise",
		"Glucometer","Specialist","Kiran",20,"Male",190.0,"Early","NGO Awareness");
		diabetes5.getInfo();

		Diabetes diabetes6 = new Diabetes("Type 2","Poor Diet","Thirst","Blood Test","Tablets",
		"Metformin","Long Acting","Diet Control","Obesity","Heart Issues","Balanced Diet","Yoga",
		"Blood Monitor","Doctor","Lakshmi",48,"Female",230.0,"Advanced","Govt Drive");
		diabetes6.getInfo();

		Diabetes diabetes7 = new Diabetes("Prediabetes","Lifestyle","None","Blood Screening",
		"Lifestyle Change","None","None","Healthy Eating","Obesity","Future Risk","Controlled Diet",
		"Walking","Glucometer","Physician","Arun",35,"Male",140.0,"Initial","Health Camp");
		diabetes7.getInfo();

		Diabetes diabetes8 = new Diabetes("Type 2","Stress","Headache","HbA1c","Medication","Insulin",
		"Long Acting","Stress Control","Hypertension","Eye Damage","Low Sugar Diet","Meditation",
		"Blood Monitor","Endocrinologist","Meena",55,"Female",240.0,"Severe","WHO Awareness");
		diabetes8.getInfo();

		Diabetes diabetes9 = new Diabetes("Type 1","Genetic","Fatigue","Blood Test","Insulin Therapy",
		"Insulin","Rapid Acting","Monitoring","Family History","Nerve Damage","Balanced Diet",
		"Exercise","Glucometer","Specialist","Vikram",22,"Male",175.0,"Moderate","Hospital Program");
		diabetes9.getInfo();

		Diabetes diabetes10 = new Diabetes("Type 2","Unhealthy Lifestyle","Frequent Urination",
		"HbA1c","Medication","Metformin","Long Acting","Diet","Obesity","Kidney Issues","Low Carb Diet",
		"Walking","Blood Monitor","Doctor","Sita",60,"Female",260.0,"Critical","Govt Campaign");
		diabetes10.getInfo();
	}
}