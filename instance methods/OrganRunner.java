class OrganRunner
{
	public static void main(String[] args)
	{
		Organ organ1 = new Organ("Heart","Pump Blood","Chest",0.3,"Fist Size","Red","Circulatory",
        "None","High","Muscular","Cardiac Cells","Rib Cage","Adult","Vital","Healthy","Heart Transplant",
        "Living/Deceased","Lifetime","Complex","Continuous Pumping");
		organ1.getInfo();
		

		Organ organ2 = new Organ("Liver","Detoxification","Abdomen",1.5,"Large","Dark Red","Digestive",
        "Hepatitis","High","Lobed","Hepatocytes","Rib Cage","Adult","Essential","Healthy","Liver Transplant",
        "Deceased","Lifetime","Complex","Metabolism");
		organ2.getInfo();

		Organ organ3 = new Organ("Kidney","Filter Blood","Lower Back",0.15,"Bean Size","Brown",
		"Excretory","Kidney Failure","Moderate","Bean Shape","Nephrons","Fat Layer","Adult",
        "Vital","Healthy","Kidney Transplant","Living/Deceased","Lifetime","Compact","Filtration");
		organ3.getInfo();

		Organ organ4 = new Organ("Lung","Breathing","Chest",1.0,"Large","Pink","Respiratory",
        "Asthma","High","Spongy","Alveoli Cells","Rib Cage","Adult","Vital","Healthy","Lung Transplant",
        "Deceased","Lifetime","Paired","Gas Exchange");
		organ4.getInfo();

		Organ organ5 = new Organ("Brain","Control Body","Head",1.4,"Medium","Pink","Nervous",
        "Stroke","High","Complex","Neurons","Skull","Adult","Critical","Healthy","No","None",
		"Lifetime","Highly Complex","Signal Control");
		organ5.getInfo();

		Organ organ6 = new Organ("Stomach","Digest Food","Abdomen",0.5,"Medium","Pink","Digestive",
        "Ulcer","Moderate","Sac Like","Epithelial Cells","Abdominal Wall","Adult","Important",
		"Healthy","Rare","None","Lifetime","Elastic","Digestion");
		organ6.getInfo();

		Organ organ7 = new Organ("Pancreas","Insulin Production","Abdomen",0.1,"Small","Yellow",
		"Endocrine","Diabetes","Moderate","Flat","Islet Cells","Abdominal Cavity","Adult","Vital",
		"Healthy","Pancreas Transplant","Deceased","Lifetime","Glandular","Hormone Secretion");
		organ7.getInfo();

		Organ organ8 = new Organ("Spleen","Filter Blood","Left Abdomen",0.2,"Small","Purple","Immune",
		"Splenomegaly","Moderate","Oval","White Blood Cells","Rib Cage","Adult","Supportive",
		"Healthy","Rare","None","Lifetime","Soft","Immune Response");
		organ8.getInfo();

		Organ organ9 = new Organ("Intestine","Absorb Nutrients","Abdomen",2.0,"Long","Pink","Digestive",
        "IBS","Moderate","Tubular","Epithelial Cells","Abdominal Cavity","Adult","Essential",
		"Healthy","Rare","None","Lifetime","Flexible","Absorption");
		organ9.getInfo();

		Organ organ10 = new Organ("Skin","Protection","Whole Body",4.0,"Largest","Varies","Integumentary",
        "Infection","Moderate","Layered","Epithelial Cells","None","Adult","Protective","Healthy",
		"Skin Graft","Living","Lifetime","Layered","Barrier Function");
		organ10.getInfo();
	}
}