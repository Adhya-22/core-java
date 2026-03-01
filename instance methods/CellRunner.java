class CellRunner
{
	public static void main(String[] args)
	{
		Cell cell1 = new Cell("Neuron","Star","Microscopic","Signal Transmission","Present","Dense",
        "Semi-permeable","Mitochondria","Mitosis","Lifetime","Brain","Complex","Glucose","Binary Fission",
		"DNA","mRNA","Healthy","None","Human","Electron");
		cell1.getInfo();

		Cell cell2 = new Cell("Red Blood Cell","Biconcave","Microscopic","Oxygen Transport","Absent",
		"Fluid","Flexible","Hemoglobin","None","120 Days","Blood","Simple","Glucose","None","DNA",
		"None","Healthy","None","Human","Light");
		cell2.getInfo();

		Cell cell3 = new Cell("White Blood Cell","Irregular","Microscopic","Immunity","Present",
		"Granular","Flexible","Lysosomes","Mitosis","Few Days","Blood","Complex","Glucose",
		"Mitosis","DNA","mRNA","Healthy","None","Human","Electron");
		cell3.getInfo();

		Cell cell4 = new Cell("Muscle Cell","Elongated","Microscopic","Movement","Present","Dense",
        "Strong","Mitochondria","Mitosis","Long","Muscle Tissue","Fibrous","ATP","Mitosis","DNA",
		"mRNA","Healthy","None","Human","Electron");
		cell4.getInfo();

		Cell cell5 = new Cell("Plant Cell","Rectangular","Microscopic","Photosynthesis","Present",
		"Thick","Cell Wall","Chloroplast","Mitosis","Long","Leaf","Rigid","Sunlight","Mitosis","DNA",
		"mRNA","Healthy","None","Plant","Light");
		cell5.getInfo();

		Cell cell6 = new Cell("Bacterial Cell","Rod","Microscopic","Reproduction","Absent","Simple",
        "Cell Wall","Ribosomes","Binary Fission","Short","Environment","Prokaryotic","Organic Matter",
		"Binary","DNA","mRNA","Healthy","Mutation A","Bacteria","Electron");
		cell6.getInfo();

		Cell cell7 = new Cell("Skin Cell","Flat","Microscopic","Protection","Present","Layered",
        "Semi-permeable","Keratin","Mitosis","Few Weeks","Skin","Layered","Glucose","Mitosis","DNA",
		"mRNA","Healthy","None","Human","Light");
		cell7.getInfo();

		Cell cell8 = new Cell("Egg Cell","Round","Microscopic","Reproduction","Present","Large",
        "Flexible","Mitochondria","Meiosis","Few Days","Ovary","Specialized","Nutrients","Meiosis",
		"DNA","mRNA","Healthy","None","Human","Electron");
		cell8.getInfo();

		Cell cell9 = new Cell("Sperm Cell","Tail","Microscopic","Fertilization","Present","Compact",
        "Flexible","Mitochondria","Meiosis","Few Days","Testes","Specialized","ATP","Meiosis","DNA",
		"mRNA","Healthy","None","Human","Electron");
		cell9.getInfo();

		Cell cell10 = new Cell("Stem Cell","Round","Microscopic","Differentiation","Present","Undifferentiated",
        "Flexible","Minimal","Mitosis","Variable","Bone Marrow","Primitive","Glucose","Mitosis",
		"DNA","mRNA","Healthy","None","Human","Electron");
		cell10.getInfo();
	}
}